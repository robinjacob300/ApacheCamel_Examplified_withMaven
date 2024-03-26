package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class COCCOnfig extends RouteBuilder{

	@SuppressWarnings("deprecation")
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		restConfiguration().host("localhost").port(8081);
		
		
		rest("/say")
        .get("/hello").to("direct:hello")
        .get("/bye").consumes("application/json").to("direct:bye")
        .post("/bye").to("direct:updateofs");

    from("direct:hello")
        .transform().constant("Hello World");

    from("direct:bye")
        .transform().constant("Bye World");
    
    from("direct:updateofs").routeId("updateofscid")
    	.log("inside the route method")
    	.setBody().constant("Returned Post value");
    
    from("direct:hellovis").routeId("hellovisRouteID")
    .log("BEGIN ROUTE HELLOWiS")
    .process(e ->{
    	
    	String vale = e.getIn().getHeader("myHeader",String.class);
    	log.info("Blue whale route :  "+vale);
    	e.getOut().setBody(vale+"This is an umbrella");
    });

    
	}

	
}
