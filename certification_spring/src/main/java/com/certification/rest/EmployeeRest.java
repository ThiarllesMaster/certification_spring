package com.certification.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certification.jakson.Employee;

@RestController
public class EmployeeRest {

	@GetMapping(path = "/employee")
	public String getEmployee() {
		return "Hello Employee";
	}
	
	@GetMapping(path = "/emp")
	public ResponseEntity<Employee>findEmployee() {
		Employee e = new Employee();
		//e.setId(1);
		e.setNameEmployee("Thiarlles");
		return new ResponseEntity<>(e, HttpStatus.OK);
	}
	
}
