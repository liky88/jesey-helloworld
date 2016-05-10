package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/helloworld")
public class HelloworldController {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Map<String, String> getContact() {
		Map<String, String> tempMap = new HashMap<String, String>();
		tempMap.put("function", "helloworld");
		return tempMap;
	}
}
