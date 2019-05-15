package com.certification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.certification.beans.Bible;
import com.certification.events.PublishEvents;

@SpringBootApplication
public class TreinamentoApplication implements CommandLineRunner{
	
	@Autowired
	private Bible bible;
	
	@Autowired
	PublishEvents publishEvents;

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(bible.getBible());
		publishEvents.publishEvent("B2C");
	}

}
