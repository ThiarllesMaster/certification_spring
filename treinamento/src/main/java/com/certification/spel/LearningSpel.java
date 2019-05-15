package com.certification.spel;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class LearningSpel {

	@Value("${some.key}")
	private String property;
	
	@PostConstruct
	public void initialize() {
		System.out.println(property);
	}
}
