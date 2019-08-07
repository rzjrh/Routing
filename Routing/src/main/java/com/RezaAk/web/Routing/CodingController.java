package com.RezaAk.web.Routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// create a new class for controller

@RestController

//use the @RequestMapping annotation for get the route after "coding"
@RequestMapping("/coding")
	
public class CodingController {
	
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	
	
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}

}
