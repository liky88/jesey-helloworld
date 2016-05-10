package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		this.packages("com.example");
		//register(HelloworldController.class);
	}
	
}