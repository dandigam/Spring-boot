package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot");
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

}
