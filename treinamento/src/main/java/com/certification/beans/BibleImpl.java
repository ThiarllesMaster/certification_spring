package com.certification.beans;

import org.springframework.beans.factory.annotation.Value;

public class BibleImpl implements Bible{

	@Value("${some.key}")
	private String value;
	
	@Override
	public String getBible() {
		return "Bible" + value;
	}
	
	

}
