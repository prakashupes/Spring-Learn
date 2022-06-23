package com.annonations.pracise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootbalCoach implements Coach{


	@Autowired
	@Qualifier("restFortune")
	private Fortune myfortune;
	
	//Note: We can actually atuto wire any of the method
/* We can comment this code since we have used autowired with filed itself. We can also use autowired here with setter and it will also work.
 * 
	public  void setMyFortune(MyFortune myFortune) {
		this.myFortune = myFortune;
	}
	*/
	
	public  String getMyFortune() {
		return myfortune.getFortune();
	}


	@Override
	public String getDailyWorkout() {
		
		return "Footbal coach";
	}
}
