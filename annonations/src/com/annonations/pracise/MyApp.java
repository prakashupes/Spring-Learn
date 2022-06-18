package com.annonations.pracise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coachObj = context.getBean("tennisCoach",Coach.class);
		System.out.println(coachObj.getDailyWorkout());
		context.close();
		

	}

}
