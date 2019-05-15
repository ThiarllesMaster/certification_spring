package com.first.events;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	public String myBean() {
		return "My Bean";
	}
	
	public String helloWorld() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.concat('Learning')");
		return (String)exp.getValue();
	}
}
