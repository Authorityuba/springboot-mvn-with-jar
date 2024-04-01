package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@GetMapping(value="/")
	public String sayHello() {
		return "Welcome to jenkins with spring boot Maven project created by Ubamadu ! ";
	}

}
