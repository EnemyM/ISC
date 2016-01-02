package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("title", "BestDev");
		model.addAttribute("h1", "Hello ISC !");
		model.addAttribute("h2", "I will be great project!");
		model.addAttribute("h3", "Information control system of delivery");
		return "main";
	}
}