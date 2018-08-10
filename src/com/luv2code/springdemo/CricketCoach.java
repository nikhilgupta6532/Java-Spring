package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	public FortuneService getFortuneService() {
		return FortuneService;
	}

	private FortuneService FortuneService ;
	
	// add new fields for email address and team
	
	private String emailAddress;
	private String team;
	
	

	//create a no-arg constructor
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: inside setter method - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket coach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach: inside setter method");
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return FortuneService.getFortune();
	}

}
