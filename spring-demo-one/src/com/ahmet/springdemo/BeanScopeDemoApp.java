package com.ahmet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the Spring conf file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\n pointing to the same object: " + result);
		System.out.println("\n Memory location for theCoach:" + theCoach);
		System.out.println("\n Memory location for alphaCoach:" + alphaCoach + "\n");
		
		context.close();

	}

}
