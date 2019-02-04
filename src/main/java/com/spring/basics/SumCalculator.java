package com.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class SumCalculator implements MathOpration {

	@Override
	public int oprate(int a, int b) {
		return a+b;
	}

}
