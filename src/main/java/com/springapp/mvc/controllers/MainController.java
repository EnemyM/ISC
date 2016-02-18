package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {


	@RequestMapping(method = RequestMethod.GET)
	public String getIndex(){
	return "registrationPage";
	}



//	@Autowired
//	UserService clientsService;
//
//	@Autowired
//	MessageSource messageSource;
//
//	@RequestMapping(value = {"/registration"},method = RequestMethod.GET)
//	public String registration(ModelMap model) {
//
//		user client = new user();
//		model.addAttribute("client", client);
//
//		return "registrationForm";
//	}
//
//
//	@RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
//	public String saveregistration(@Valid user client, BindingResult result,
//								  ModelMap model){
//		if (result.hasErrors()){
//			return "registrationForm";
//		}
//		if (! clientsService.isClientEmailUnique(client.getId_client(),client.getEmail_client())){
//			FieldError error = new FieldError("client", "email_client",messageSource.getMessage("non.unique.email_client",
//					new String[]{client.getEmail_client()}, Locale.getDefault()));
//			result.addError(error);
//			return "registrationForm";
//		}
//
//		clientsService.saveClient(client);
//		model.addAttribute("success", "Client " + client.getFirst_name() + " " + client.getLast_name()
//				+ " Registered success");
//		model.addAttribute("title", "main");
//		return "main";
//	}


}