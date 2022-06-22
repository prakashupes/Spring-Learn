package com.annonations.pracise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootbalCoach implements Coach{



	private MyFortune myFortune;
	@Autowired
	//Note: We can actually atuto wire any of the method
	public  void setMyFortune(MyFortune myFortune) {
		this.myFortune = myFortune;
	}
	
	
	public void setmanualFortuneHelper()
	{
		myFortune.setmanualFortune("Your Luck is in your hand");
	}
	
	public  String getMyFortune() {
		return myFortune.getMaualFortune();
	}



	@Override
	public String getDailyWorkout() {
		
		return "Footbal coach";
	}
}
