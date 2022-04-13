package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//pour changer le scope
// @Scope("prototype")
public class TennisCoach implements Coach {

	//Field injection 
	@Autowired
	//définir quelle implémentation de l'interface va etre utilisée
	@Qualifier("fileFortuneService")
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
	
	// define my init method
		@PostConstruct
		public void doMyStartupStuff() {
			System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
		}
		
		// define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");		
		}
	
	 
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
