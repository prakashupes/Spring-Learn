package test1package;

public class BaseBallCoach implements Coach{
	private FortuneHelper fortune;
	public BaseBallCoach(FortuneHelper obj) {
		fortune=obj;
	}
	@Override
	public String Mytasks()
	{
		return "BaseBallCoach";
	}
	@Override
	public String myFortune() {
		
		return fortune.getFortune();
	}
	

}
