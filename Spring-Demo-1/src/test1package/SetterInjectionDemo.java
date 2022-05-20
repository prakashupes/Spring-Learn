package test1package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	public static void main() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myFootball",Coach.class);
		System.out.println(myCoach.myFortune());
		System.out.println(myCoach.Mytasks());
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
	 
	
	*/
		

	}
}
