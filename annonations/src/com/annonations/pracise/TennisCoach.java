package com.annonations.pracise;

import org.springframework.stereotype.Component;

@Component("myCoach") 
//As previously we were creating the bean for that class and assigning IDs now myCoah use as bean id since 
//spring automatically create a bean and assign the id as coach.
public class TennisCoach implements Coach{
	public String getDailyWorkout() {
		return "Tennis practise";
		
	}

}
