package com.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.configuracaaaaaaaaaaaaoooo.Jesus;

@SpringBootApplication
public class CertificationApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier(value = "jesuso")
	private Jesus helloWorld;

	public static void main(String[] args) {
		SpringApplication.run(CertificationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String x = helloWorld.test();
		System.out.println(x);
		
	}

}
