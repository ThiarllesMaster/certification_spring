package com.first.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.first.entities.Employee;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeDataTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testSave() {
		Employee e = new Employee();
		e.setName("Employee Name");
		
		entityManager.persist(e);
		
		
	}
}
