package test1package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach aCoach =contex.getBean("myCoach",Coach.class);
		System.out.println(aCoach.Mytasks());
		System.out.println(aCoach.myFortune());
		contex.close();
		
		/*Dependency injection:
		1.Constructor injection: lets say now coach interface will return now one more function called myFortune();
			Now coach is dependent on other interface to complete this task.
			Step: 1. Define the dependency interface and class
			Interface: FortuneService havse method public string get fortune.
			class: FortuneHelper implements FortuneService.
			
			step 2. Add constructor to our class
			 BaseballCoach(FortuneService obj) {fortuneservice=obj}
			 
			 step 3: add dependency in xml file
			 <bean id="fortune"
          		class="test1package.FortuneHelper">
    		</bean>
			 <bean id="myCoach"
          		class="test1package.BaseballCoach">
          		<constructor-arg ref="fortune"/>
    		</bean>
    		
    		
    		Behind the scene:
    		Spring: does the following for the xml:
    		 FortuneHelper fObj=new FortuneHelper();
    		 BaseballCoach coach=new BaseballCoach(fObj);
    		 
    		     <bean id="myCoach"
          class="test1package.CricketCoach">
          <constructor-arg ref="fortune"/> 
          </bean>
          <!-- It is creating an object of baseball/cricket class and 
          passing object of fortune as constructor argument, so we must have a constuctor which takes the argument -->
    
    		 
		2. setter injection
		 
		 
		
		*/
		
		


	}

}
