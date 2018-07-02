package com.ahmet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the Spring conf file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		context.close();

	}

}
