package com.spring.basics;

public class Calculator {
	
	MathOpration mathOperation = new SumCalculator();

	public int mathOperation(int a, int b) {
		return mathOperation.oprate(a,b);
	}
}
