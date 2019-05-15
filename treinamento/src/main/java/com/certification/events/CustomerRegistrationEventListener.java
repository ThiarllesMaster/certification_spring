package com.certification.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerRegistrationEventListener {

    @EventListener(condition = "#event.name.equals('B2C')")
    void handleRegistration(CustomerRegistrationEvent event){
        System.out.println("Registration event got triggered for customer::  " + event.getName());
    }
}