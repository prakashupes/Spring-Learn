package com.javaconfig.practise;



public class HockeyCoach implements Coach{
	private MyFortune fortune;
	public HockeyCoach(MyFortune obj) {
		this.fortune=obj;
		
		
	}
	@Override
	public String Mytasks() {
		
		// TODO Auto-generated method stub
		return "Hockey Practise";
	}

	@Override
	public String getMyFrotune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
