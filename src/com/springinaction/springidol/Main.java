package com.springinaction.springidol;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");  
		
		// new com.springinaction.springidol.Juggler(); 
		Performer performer1 = (Performer) ctx.getBean("duke");
		performer1.perform();
		
		// Poem sonnet29 = new Sonnet29();  
		// Performer duke = new PoeticJuggler(15, sonnet29); 
//		Performer performer2 = (Performer) ctx.getBean("poeticDuke");
//		performer2.perform();
		
//		Stage performer = new Stage();
//		Stage stage = (Stage) ctx.getBean("theStage");
//		performer3.getInstance();
//		Stage.getInstance();
		
//		Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
//		
//		Performer performer3 = (Performer) ctx.getBean("kenny");
//		performer3.perform();
		
//		Performer performer4 = (Performer) ctx.getBean("jenny");
//		performer4.perform();

//		Performer performer5 = (Performer) ctx.getBean("venny");
//		performer5.perform();

//		Performer performer6 = (Performer) ctx.getBean("hank");
//		performer6.perform();

//		Performer performer7 = (Performer) ctx.getBean("tank");
//		performer7.perform();

//		Performer performer8 = (Performer) ctx.getBean("bank");
//		performer8.perform();

//		List<City> cities = (List<City>) ctx.getBean("cities");
//		System.out.println(cities);

		City querySet = (City) ctx.getBean("querySet");
		System.out.println(querySet);
	}

}
