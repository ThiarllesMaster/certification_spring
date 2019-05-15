package com.certification.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Scope(value = "prototype")
public class Life {

	@PostConstruct
	public void initialize() {
		log.info("Bean is being created....");
		
	}
	
	@PreDestroy
	public void destroy() {
		log.info("The bean is being destroying...");
	}
}
