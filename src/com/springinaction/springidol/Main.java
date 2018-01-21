package com.springinaction.springidol;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import onlyfun.caterpillar.HelloBean;

public class Main {

	public static void main(String[] args) {
		Resource rs = new FileSystemResource("spring-idol.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		
		// new com.springinaction.springidol.Juggler(); 
		Performer performer1 = (Performer) factory.getBean("duke");
		performer1.perform();
		
		// Poem sonnet29 = new Sonnet29();  
		// Performer duke = new PoeticJuggler(15, sonnet29); 
		Performer performer2 = (Performer) factory.getBean("poeticDuke");
		performer2.perform();
		
//		Stage performer = new Stage();
		Stage stage = (Stage) factory.getBean("theStage");
//		performer3.getInstance();
//		Stage.getInstance();
		
		Auditorium auditorium = (Auditorium) factory.getBean("auditorium");
		
		Performer performer3 = (Performer) factory.getBean("kenny");
		performer3.perform();
		
	}

}
