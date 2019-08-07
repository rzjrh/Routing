package com.RezaAk.web.Routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping(value = "/{value}", method=RequestMethod.GET)
	
	
	//declare the @PathVariable as value
	public String dojo(@PathVariable("value") String value) {
		
		if(value.equals("dojo")) {
			return "The "+value+" is awesome!";	
		}
		
		else if(value.equals("burbank-dojo")) {
			return value+" is located in Southern California.";
		}
		
		else if(value.equals("san-jose")) {
			return value+ " dojo is the headquarters";
		}
		
		else {
			return "The "+value+" dose not existed in our database";
		}
	}
	
}