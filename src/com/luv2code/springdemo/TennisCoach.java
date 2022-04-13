package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	//Field injection 
	@Autowired
	//définir quelle implémentation de l'interface va etre utilisée
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
	
	//-----------------------------------------------------
	//Constructor
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	//Constructeur avec le @Qualifier
//	@Autowired
//	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
//
//	System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
//	        
//	fortuneService = theFortuneService;
//	}

	 //-----------------------------------------------------
	 //setter
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	
	//Setter avec le @Qualifier
	
	@Autowired
	public void setFortuneService(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	
	//ou
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	
	*/
	
	 //-----------------------------------------------------
	 //methode
	   
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
