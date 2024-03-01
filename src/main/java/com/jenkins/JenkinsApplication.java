package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JenkinsApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("continous integration job before run");
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Application command line runner log");
		
	}

}
