package test1package;

public class CricketCoach implements Coach{
	private FortuneHelper fortuneObj;
	public  CricketCoach(FortuneHelper obj) {
		fortuneObj=obj;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Mytasks()
	{
		return "CricketCoach";
	}

	@Override
	public String myFortune() {
		// TODO Auto-generated method stub
		return fortuneObj.getFortune();
	}

}
