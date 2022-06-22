package com.annonations.pracise;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements Fortune{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "From REST Fortune: your lucky day";
	}
	

}
