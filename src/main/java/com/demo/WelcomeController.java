package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/getMessage")
	public String getWelcomeMessage() {
		return "Welcome to Jenkins World......";
	}
}
