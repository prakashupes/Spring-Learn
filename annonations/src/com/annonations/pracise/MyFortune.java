package com.annonations.pracise;

import org.springframework.stereotype.Component;

@Component
public class MyFortune implements Fortune{

	@Override
	public String getFortune() {
		return "your lucky day";
		// TODO Auto-generated method stub
		
	}
	

}
