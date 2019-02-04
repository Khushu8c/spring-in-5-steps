package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Autowired
	MathOpration mathOperation;
	
	public Calculator(MathOpration mathOperation) {
		this.mathOperation = mathOperation;
	}

	public int mathOperation(int a, int b) {
		return mathOperation.oprate(a,b);
	}
}
