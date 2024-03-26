package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
public class EchoStationRoutes extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		rest("/echo")
        .get("/hello")
        .param().name("myHeader").type(RestParamType.header)
        .defaultValue("form echo guys").description("Description of myHeader")
        .endParam()
        .to("direct:hellovis");
	}

}
