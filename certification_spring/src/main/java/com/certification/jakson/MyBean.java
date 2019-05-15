package com.certification.jakson;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyBean {

	private Integer id;
    private String name;
    @JsonIgnore
    private String address;
    
  
	
}
