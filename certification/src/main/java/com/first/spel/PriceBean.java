package com.first.spel;

import org.springframework.stereotype.Component;

@Component("priceBean")
public class PriceBean {

	public String test(String word) {
		return word;
	}
	
	public boolean isChampion(String teamName) {
		if (teamName.equals("Grêmio"))
			return true;
		else 
			return false;
	}
	
	public boolean isGreaterSoul(String team) {
		if (team.equals("Grêmio")) 
			return true;
		else 
			return false;
	}
	
}
