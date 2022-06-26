package com.javaconfig.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaConfig {
	public static void main(String []args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (SportConfig.class);
		Coach myCoach = context.getBean("swimCoach",Coach.class);
		System.out.println(myCoach.Mytasks());
		System.out.println(myCoach.getMyFrotune());
		context.close();
		
		
		
		}

}
