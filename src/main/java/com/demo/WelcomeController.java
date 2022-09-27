package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String getWelcomeMessage() {
		return "Welcome Rahul to Jenkins World......";
	}
}
