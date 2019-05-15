package com.first.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class LearningSpelBean {
	
	@Value("#{ systemProperties['user.language'] }")
	private String language;
	
	 @Value("#{ systemProperties }")
	  private java.util.Properties systemProperties;
	 
	 @Value("#{priceBean.test('Rafa')}")
	 private String rafa;
	 
	 @Value("#{priceBean.isChampion('Grêmioxxxx') and priceBean.isGreaterSoul('Grêmio')}")
	 private boolean isGremio;

	public String checkLenght() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'I love my Rafinha'.toUpperCase()");
		return (String)exp.getValue() + language + rafa + new Boolean(isGremio);
	}
	
	
	
}
