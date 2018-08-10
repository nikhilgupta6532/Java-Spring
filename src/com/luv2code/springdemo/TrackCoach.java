package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService FortuneService ;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ FortuneService.getFortune();
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
