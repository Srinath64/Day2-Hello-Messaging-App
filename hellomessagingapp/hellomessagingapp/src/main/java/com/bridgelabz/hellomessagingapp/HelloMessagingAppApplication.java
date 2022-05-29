package com.bridgelabz.hellomessagingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMessagingAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabz");
		SpringApplication.run(HelloMessagingAppApplication.class, args);
	}

}
