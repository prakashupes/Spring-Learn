package com.javaconfig.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

	@Autowired
	private MyFortune myFortune;
	
	@Value("Note: Values reading from property fle") //we can also hardcode the value
	private String note;
	@Value("${email}")
	private String email;

	@Override
	public String Mytasks() {
		
		return "MySwim Coach";
	}
	
	public String getMyFrotune()
	{
		return myFortune.getFortune();
	}
	public String getEmail()
	{
		return this.note+" --->"+this.email;
	}
	

}
