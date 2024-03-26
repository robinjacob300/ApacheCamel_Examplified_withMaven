package com.example.demo;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiplePortConfiguration {

	@Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> containerCustomizer() {
        return factory -> {
            factory.addAdditionalTomcatConnectors(createAdditionalConnector(8081)); // Add additional port configurations here
            factory.addAdditionalTomcatConnectors(createAdditionalConnector(8082)); // Add more additional ports if needed
        };
    }

    private Connector createAdditionalConnector(int port) {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(port);
        return connector;
    }
    
    
}