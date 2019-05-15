package com.certification.eight;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.certification.entities.Employee;
import com.certification.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeTest {

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	EmployeeRepository employeeRepository;

	@Before
	public void setUp() {
		Employee e = new Employee();
		e.setName("Employee Name");
		testEntityManager.persist(e);
		testEntityManager.flush();

	}

	@Test
	public void testFindEmployees() {
		List<Employee>employees =  StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
				.filter(e -> e.getName().equals("Employee Name")).collect(Collectors.toList());
	     log.info("Employees id {}" , employees.get(0).getEmployeeId());
	     assertTrue(1 == employees.get(0).getEmployeeId());
	     
	     //Use the find first 
	     Employee e = employees.stream().filter(emp-> emp.getEmployeeId() > 10)
	    		 .findFirst().orElse(null);
	     assertTrue(e == null);
	     //Use the count ...
	     Long quantity = employees.stream().filter(emp -> emp.getName().equals("Employee Name")).count();
	     assertTrue(quantity == 1);
	     //Use the compare...
	     Employee emps = employees.stream().max(Comparator.comparing(Employee::getEmployeeId)).orElse(null);
	     
	     
	}
	
	
}
