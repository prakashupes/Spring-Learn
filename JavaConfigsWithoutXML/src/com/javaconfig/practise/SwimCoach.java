package com.javaconfig.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

	@Autowired
	private MyFortune myFortune;
	
	
	@Override
	public String Mytasks() {
		
		return "MySwim Coach";
	}
	
	public String getMyFrotune()
	{
		return myFortune.getFortune();
	}
	

}
