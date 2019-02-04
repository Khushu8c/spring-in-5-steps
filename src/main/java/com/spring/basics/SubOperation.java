package com.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SubOperation implements MathOpration{

	@Override
	public int oprate(int a, int b) {
		return a-b;
	}

}
