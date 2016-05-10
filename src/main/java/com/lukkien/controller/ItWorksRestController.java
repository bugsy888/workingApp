package com.lukkien.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukkien.model.SimpleTest;

@RestController
public class ItWorksRestController {
	
	@RequestMapping(value = "/rest/working")
	public SimpleTest showItWorks() {
		
		SimpleTest itWorks = new SimpleTest();
		itWorks.setValue("It works");
		
		return itWorks;
	}
	

}
