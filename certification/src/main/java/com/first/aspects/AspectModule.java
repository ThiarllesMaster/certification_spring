package com.first.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectModule {

	@Before("execution(* com.first.spel.LearningSpelBean.checkLenght(..))")
	private void logExecution() {
		System.out.println("Goleiro CASSIO");
	}
	
	@Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
	private void getM() {
		System.out.println("Get Method");
	}
}
