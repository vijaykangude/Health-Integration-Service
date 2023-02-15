package com.HealthIntegration.HealthIntegrationService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/get")
	public String Hello() {
		return "Hello Sir...";
	}

}
