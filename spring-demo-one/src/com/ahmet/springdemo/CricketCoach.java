package com.ahmet.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("i am setter method of setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("i am setter method of setTeam");
		this.team = team;
	}

	// no-arg constructor
	public CricketCoach() {
		System.out.println("i am CricketCoach constructor :)");
	
	}

	// setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("i am setter method of setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
