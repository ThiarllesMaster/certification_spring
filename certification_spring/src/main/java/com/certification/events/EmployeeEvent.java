package com.certification.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeEvent {

	@EventListener
	public void handleAllEventsRest(RequestHandledEvent event) {
		log.info(event.toString() + "Event actioned :)");
	}
	
}
