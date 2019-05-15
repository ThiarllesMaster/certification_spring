package com.certification.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PublishEvents {

	@Autowired
	private ApplicationEventPublisher publisher;
	
		
	public void publishEvent(final String name) {
	    publisher.publishEvent(new CustomerRegistrationEvent(name));
	}
}
