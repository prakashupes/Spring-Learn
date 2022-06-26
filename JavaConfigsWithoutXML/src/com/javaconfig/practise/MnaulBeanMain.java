package com.javaconfig.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MnaulBeanMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ManualBeanConfig.class);
		Coach coach = context.getBean("hockeyCoach",Coach.class);
		System.out.println(coach.getMyFrotune());
		System.out.println(coach.Mytasks());
		
		context.close();

	}

}
