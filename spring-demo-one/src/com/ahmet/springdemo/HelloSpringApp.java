package com.ahmet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// spring konfigurasyon dosyasını yükle
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring container den bean geri al
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// bean de metotları çağır
		System.out.println(theCoach.getDailyWorkOut());
		
		// fortunes için yeni metodu çağır
		System.out.println(theCoach.getDailyFortune());
		
		// context i kapat
		context.close();
	}

}
