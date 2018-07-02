package com.ahmet.springdemo;

public class BaseballCoach implements Coach{
	
	// a private field for the dependency
	private FortuneService fortuneService;
	
	// a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
