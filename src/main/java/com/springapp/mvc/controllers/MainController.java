package com.springapp.mvc.controllers;

import com.springapp.mvc.services.user.UserService;
import com.springapp.mvc.services.user.role.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	UserRoleService userRole;
	@Autowired
	UserService userService;

	@RequestMapping(value = {"/","/login"},method = RequestMethod.GET)
	public String getIndex(){

	return "login/login";
	}
	@RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
	private String getRegisterForm(){

//		Set<user_role> list = userService.findByEmail("user@mail.ru").getUser_role();
//		for (user_role roles: list){
//			System.out.println("User role: " + roles.getUser_role());
//		}
//		System.out.println("user is: " + userService.findByEmail("user@mail.ru").getName_firm());
//		System.out.println("role user is: " + userRole.findByRole("ROLE_CLIENT").getId_user_role());
//		System.out.println("role user is 2: " + userRole.findRoleById(2).getUser_role());

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
//		user user = new user();
//		model.addAttribute("user", user);
//
//		return "registrationForm";
//	}
//
//
//	@RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
//	public String saveregistration(@Valid user user, BindingResult result,
//								  ModelMap model){
//		if (result.hasErrors()){
//			return "registrationForm";
//		}
//		if (! clientsService.isClientEmailUnique(user.getId_client(),user.getEmail_client())){
//			FieldError error = new FieldError("user", "email_client",messageSource.getMessage("non.unique.email_client",
//					new String[]{user.getEmail_client()}, Locale.getDefault()));
//			result.addError(error);
//			return "registrationForm";
//		}
//
//		clientsService.saveClient(user);
//		model.addAttribute("success", "Client " + user.getFirst_name() + " " + user.getLast_name()
//				+ " Registered success");
//		model.addAttribute("title", "main");
//		return "main";
//	}


}