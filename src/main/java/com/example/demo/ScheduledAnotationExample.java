package com.example.demo;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduledAnotationExample {

	@Scheduled(cron = "*/7 * * * * *")
	public void MyScheduledAnotationExample()
	{
		System.out.println("Inside the scheduled job function...");
		System.out.println("executing the functions....");
	}
}
