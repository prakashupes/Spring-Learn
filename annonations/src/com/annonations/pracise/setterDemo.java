package com.annonations.pracise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemo {

	public static void main(String[] args) {

		//2. setter injection:
		//Let say we have setters, So instead of writing code for them, We can use spring functionality to set the values through 
		//the setters. We do not need to call setter method and pass values through the argument. Spring will do that
		
		
		//Note: We can actually atuto wire any of the method
		
		/*
		 * There are an issue with autowired , what if there are multiple class implemeted with the same interface then 
		 * it will give error (only if we have created object using interface name).
		 * so we use @Qualifier("bean_id"), before setter/field/constructor, where we use auto wired.
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FootbalCoach myCoach= context.getBean("footbalCoach",FootbalCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getMyFortune());
		context.close();
		
		
	}

}
