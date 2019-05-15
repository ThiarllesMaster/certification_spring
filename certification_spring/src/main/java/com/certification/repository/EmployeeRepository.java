package com.certification.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.certification.entities.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	List<Employee>findByName(String name);
}
