package edu.depaul.se452.group3.hotel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FindARoomApplication {
	@Value("${app.greeting}")
	private String greeting;
	public static void main(String[] args) {
		SpringApplication.run(FindARoomApplication.class, args);
	}

	@Bean
	public void hello() { ///remove 
		System.out.println("*** Hello Group 3 ***");

	}

}