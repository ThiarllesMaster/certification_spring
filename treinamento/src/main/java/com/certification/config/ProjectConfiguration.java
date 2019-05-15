package com.certification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.certification.beans.Bible;
import com.certification.beans.BibleImpl;

@Configuration
public class ProjectConfiguration {

	@Bean
	public Bible createBible() {
		return new BibleImpl();
	}
}
