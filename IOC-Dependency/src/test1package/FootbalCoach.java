package test1package;



public class FootbalCoach implements Coach{

	private FortuneHelper helper;
	private String email;
	private String team;
	
	@Override
	public String Mytasks() {
			return "FotballCoach";
	}

	@Override
	public String myFortune() {
		
		return helper.getFortune();
	}
	//setters
	public void setFortuneService(FortuneHelper obj)
	{
		this.helper=obj;
		
	}
	public void setEmail(String val)
	{
		this.email=val;
		return;
	}
	public void setTeam(String val)
	{
		this.team=val;
		return;
	}

	//getters
	public String getEmail()
	{
		
		return this.email;
	}
	public String getTeam()
	{
		
		return this.team;
	}
}
