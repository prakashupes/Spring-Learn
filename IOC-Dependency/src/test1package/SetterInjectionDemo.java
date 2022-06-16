package test1package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FootbalCoach myCoach = context.getBean("myFootball",FootbalCoach.class); /*we have used Football coach object instead of Coach interface, becs
		 we need to call few getters that are not in Coach interface
		*/
		System.out.println(myCoach.myFortune());
		System.out.println(myCoach.Mytasks());
		System.out.println(myCoach.getEmail());
		context.close();
		/*
		2. setter injection
	 	1.Create setter method in class to injection
	 	2.Configure the dependency in spring config file
	 	
	 	<bean id="myFootball" 
           class="test1package.FootbalCoach" >
    <property name="fortuneService" ref="fortune"></property>
    
    </bean>
    --Spring calls set+Name(ref), setFortuneService(FortuneHelper),
    
    ***
    *Lets say we have two more filed in Football coach, team and email.
    *So we can assing th values using xml:
    *private String email;
    *	public void setEmail(String val)
	{
		this.email=val;
		return;
	}
	*
	*<bean id="myFootball" 
           class="test1package.FootbalCoach" >
    <property name="fortuneService" ref="fortune"></property>
    <property name="email" value="abc@india.in"></property> --This will assign value to email setter
    <property name="team" value="India"></property>
    </bean>



	**Its have the issue,Email and team is hardcoded in xml, we use property file for values
	*create propery file
	*Load file in spring configs
	*readvalue form prop[erty file
	*
	 
	
	*/
		

	}
}
