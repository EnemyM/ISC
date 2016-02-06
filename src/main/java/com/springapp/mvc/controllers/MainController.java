package com.springapp.mvc.controllers;

import com.springapp.mvc.model.clients.clients;
import com.springapp.mvc.services.clients.ClientsPhonesService;
import com.springapp.mvc.services.clients.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	ClientsService clientsService;

	@Autowired
	ClientsPhonesService clients_phonesService;


	@RequestMapping(value = {"/","/registration"},method = RequestMethod.GET)
	public String registration(ModelMap model) {

		clients client = new clients();
		model.addAttribute("client", client);
		model.addAttribute("edit", false);
		return "registrationForm";
	}
	@RequestMapping(value = {"/newclient"}, method = RequestMethod.POST)
	public String saveregistration(@Valid clients client, BindingResult result,
								  ModelMap model){
		if (result.hasErrors()){
			return "registrationForm";
		}
		clientsService.saveClient(client);
		model.addAttribute("success", "Client " + client.getFirst_name() + " " + client.getLast_name()
				+ " Registered success");
		model.addAttribute("title", "main");
		return "main";
	}


}