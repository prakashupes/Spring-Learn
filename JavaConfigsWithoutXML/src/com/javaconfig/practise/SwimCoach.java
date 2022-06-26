package com.javaconfig.practise;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

	@Override
	public String Mytasks() {
		
		return "MySwim Coach";
	}
	

}
