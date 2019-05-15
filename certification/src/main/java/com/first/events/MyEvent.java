package com.first.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class MyEvent {
	
	@Autowired
	private MyBean myBean;

	@EventListener
	public void handleEvent(RequestHandledEvent event) {
		System.out.println(event + myBean.myBean());
	}
}
