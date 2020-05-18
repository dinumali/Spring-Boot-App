package com.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@RequestMapping("")
	public String getDefaultMessage() {
		return "Hi";
	}
	
	@RequestMapping("/hello")
	public String getSpesifiedMessage() {
		return "Hello";
	}

}
