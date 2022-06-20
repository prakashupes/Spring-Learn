package com.annonations.pracise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemo {

	public static void main(String[] args) {

		//2. setter injection:
		//Let say we have setters, So instead of writing code for them, We can use spring functionality to set the values through 
		//the setters. We do not need to call setter method and pass values through the argument. Spring will do that
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FootbalCoach myCoach= context.getBean("footbalCoach",FootbalCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getMyFortune());
		context.close();
		
		
	}

}
