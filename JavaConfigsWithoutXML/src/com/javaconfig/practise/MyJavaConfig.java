package com.javaconfig.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaConfig {
	public static void main(String []args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (SportConfig.class);
		Coach myCoach = context.getBean("swimCoach",Coach.class);
		SwimCoach mySwimCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(myCoach.Mytasks());
		System.out.println(myCoach.getMyFrotune());
		System.out.println(mySwimCoach.getEmail());
		context.close();

		
		}

}
