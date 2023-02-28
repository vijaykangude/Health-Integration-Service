package com.HealthIntegration.HealthIntegrationService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String Home(){
		return "Welcome to Spring Boot App";
	}
	
	@GetMapping("/get")
	public String Hello() {
		return "Hey hiii...";
	}

}
