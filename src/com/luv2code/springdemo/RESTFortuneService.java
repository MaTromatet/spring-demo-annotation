package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
//ATTENTION si le nom de la classe commence par plus d'une lettre en majuscule et que le nom de l'id dans @Component n'est pas spécifié, l'id est le nom exact de la classe et la permiere lettre n'est pas modifiée
// Ex : ici l'id du component sera "RESTFortuneService" et non "rESTFortuneService"
public class RESTFortuneService implements FortuneService {

	@Override
	
	public String getFortune() {
		return "RESTFortuneService";
	}

}
