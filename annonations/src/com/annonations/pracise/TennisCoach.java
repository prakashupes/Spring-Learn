package com.annonations.pracise;

import org.springframework.stereotype.Component;

//  @Component("myCoach")  

//above is expicit bean id declaration
//As previously we were creating the bean for that class and assigning IDs now myCoah use as bean id since 
//spring automatically create a bean and assign the id as coach.

//If we do not provide the bean id to component then it will automatic assign the bean ID as  tennisCoach

@Component
public class TennisCoach implements Coach{
	private
		MyFortune fortune;
	
	public TennisCoach(MyFortune obj)
	{
		this.fortune=obj;
		
	}
	public String getDailyWorkout() {
		return "Tennis practise";
		
	}
	public String printFortune()
	{
		return fortune.getFortune();
	}

}
