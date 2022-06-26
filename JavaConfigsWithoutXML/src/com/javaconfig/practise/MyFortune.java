package com.javaconfig.practise;

import org.springframework.stereotype.Component;

@Component
public class MyFortune implements FortuneService{

	@Override
	public String getFortune() {
		
		return "Your lucky day";
		
		
	}

}
