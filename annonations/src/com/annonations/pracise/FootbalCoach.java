package com.annonations.pracise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootbalCoach implements Coach{



	private MyFortune myFortune;
	@Autowired
	public  void setMyFortune(MyFortune myFortune) {
		this.myFortune = myFortune;
	}
	public  String getMyFortune() {
		return myFortune.getFortune();
	}



	@Override
	public String getDailyWorkout() {
		
		return "Footbal coach";
	}
}
