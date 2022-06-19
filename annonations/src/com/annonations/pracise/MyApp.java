package com.annonations.pracise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach coachObj = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(coachObj.getDailyWorkout());
		System.out.println(coachObj.printFortune());
		context.close();
		

	}

}
