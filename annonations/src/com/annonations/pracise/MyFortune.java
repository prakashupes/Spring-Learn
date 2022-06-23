package com.annonations.pracise;


import org.springframework.stereotype.Component;

@Component
public class MyFortune implements Fortune{
	private String manualFortune;

	@Override
	
	public String getFortune() {
		return "your lucky day";
		// TODO Auto-generated method stub
		
	}
	public void setmanualFortune(String str)
	{
		this.manualFortune=str;
	}
	public String getMaualFortune()
	{
		return manualFortune;
	}
	

}
