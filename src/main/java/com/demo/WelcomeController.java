package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/getMessage/{name}")
	public String getWelcomeMessage(@PathVariable("name") String name) {
		return "Welcome " + name + " to Jenkins World......";
	}
}
