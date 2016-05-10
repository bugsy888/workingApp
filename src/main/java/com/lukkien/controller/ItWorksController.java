package com.lukkien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItWorksController {

	@RequestMapping(value = "/working")
	public String itWorks(Model model) {
		model.addAttribute("itWorks", "It works");
		return "working";
	}
	
}
