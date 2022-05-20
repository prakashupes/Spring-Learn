package test1package;


public class FootbalCoach implements Coach{

	private FortuneHelper helper;
	@Override
	public String Mytasks() {
		// TODO Auto-generated method stub
		return "FotballCoach";
	}

	@Override
	public String myFortune() {
		// TODO Auto-generated method stub
		return helper.getFortune();
	}
	
	public void setFortuneService(FortuneHelper obj)
	{
		this.helper=obj;
	}

}
