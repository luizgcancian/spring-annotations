package com.luiz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTesting {

	public static void main(String[] args) {
		
		// reading the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		
		TennisCoach theCoach = (TennisCoach) context.getBean("tennisCoach",Coach.class);
		
		// Using method of the bean
		
		System.out.println(theCoach.getYourSalary());
		

		
		//Closing the app
		
		context.close();
		
		
		

	}

}
