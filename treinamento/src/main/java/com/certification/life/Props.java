package com.certification.life;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Props implements BeanNameAware{

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("NAAAAMMMEEE" + name);
	}

}
