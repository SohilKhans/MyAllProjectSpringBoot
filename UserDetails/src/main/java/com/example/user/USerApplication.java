package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class USerApplication {

	public static void main(String[] args) {
		SpringApplication.run(USerApplication.class, args);
	}

}
