package com.example.controllero;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class ASControllero {

	@PostConstruct
	public void puba()
	{
		System.out.println("Inside the post construct method puba");
		System.out.println("Inside the post construct method puba");
		System.out.println("Inside the post construct method puba");
		System.out.println("Inside the post construct method puba");

	}
	
	@GetMapping("/restos")
	public String restos()
	{
		return "Inside the restos method....";
	}
}
