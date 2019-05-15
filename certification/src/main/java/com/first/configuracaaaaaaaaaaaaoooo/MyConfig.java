package com.first.configuracaaaaaaaaaaaaoooo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean(value = "jesus")
	public Jesus helloWorldPodeColocarQualquerCOisaa() {
		return new JesusImpl();
	}
}
