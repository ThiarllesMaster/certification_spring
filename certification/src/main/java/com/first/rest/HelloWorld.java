package com.first.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.events.MyBean;
import com.first.service.GreetingService;
import com.first.spel.LearningSpelBean;

@RestController
public class HelloWorld {
	
	@Autowired
	private MyBean bean;
	
	@Autowired
	GreetingService greetingService;
	
	@Autowired
	private LearningSpelBean learn;

	@GetMapping(value = "/hello")
	public String hello() {
		if (greetingService.helloWorld().equals("Test")) 
			return "Test";
		return "Hello" + bean.helloWorld() + greetingService.helloWorld();
	}
	
	@GetMapping("/upper")
	public String upper() {
		return learn.checkLenght();
	}
}
