package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo",
		"com.example.controllero"})
public class CamelExamplePhiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelExamplePhiApplication.class, args);
		System.out.println("Starting ....");
	}

}
