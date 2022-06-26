package com.javaconfig.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualBeanConfig {
	
	/*
	 * So, So beans creates a object for us , which we are using in main class because of that we are returning the object
	 * new HockeyCoach(myFortune()); Written because HocekyCoch have the parameterized constructor, 
	 * and when bean will create an object.
	 * then it will required MyFortune's object as parameter, so we are passing the bean id while returning the object.
	 */
	
	@Bean
	public MyFortune myFortune()
	{
		return new MyFortune();
	}
	
	@Bean
	public HockeyCoach hockeyCoach()
	{
		return new HockeyCoach(myFortune());
	}

}
