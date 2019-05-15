package com.certification.jakson;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@JsonFilter("studentFilter")
@Getter
@Setter
public class Student {
	
	@JsonProperty("studentName")
	private String name;
	
	@JsonProperty("studentAge")
	private Integer age;
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;

	}

}
