package com.spring.basics;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class,
				args);
		
		Calculator cal = new Calculator();
		int result = cal.mathOperation(2, 4);
		LogManager.getLogger().info("result of opeation is: "+result);
	}

}

