package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "actuatorcustomexample")
public class ActuatorEndointExample {

	@ReadOperation
	public Map<String,String> myExampleActuatorCode()
	{
		System.out.println("Inside myExampleActuate Method ");
		Map<String, String> hp =new HashMap<>();
		hp.put("dphi", "getosphi");
		hp.put("k1", "UP");
		hp.put("mark3", "DOWN");
		hp.put("doglas", "doing good");
		System.out.println("Retriving actuator data...");
		return hp;
	}
}
