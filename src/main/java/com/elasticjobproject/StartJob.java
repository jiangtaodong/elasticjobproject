package com.elasticjobproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartJob {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("classpath:jobs.xml");
		
	}
	
}
