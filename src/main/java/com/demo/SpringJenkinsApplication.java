package com.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("------------------------------");
		log.info("------------------------------");
		log.info("------------------------------");
		log.info("Service Starterd at : {}", new Date());
	}
}
