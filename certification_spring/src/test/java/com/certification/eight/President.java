package com.certification.eight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class President {

	private String namePresident;
	private boolean isPrepared;
	private Integer age;
	
	public President(String namePresident, boolean isPrepared, Integer age) {
		this.namePresident = namePresident;
		this.isPrepared = isPrepared;
		this.age = age;
	}

}
