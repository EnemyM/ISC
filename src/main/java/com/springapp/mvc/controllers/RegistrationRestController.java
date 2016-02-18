package com.springapp.mvc.controllers;

import com.springapp.mvc.model.user.user;
import com.springapp.mvc.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Anton on 10.02.2016.
 */
@RestController(value = "/registration/")
public class RegistrationRestController {
    @Autowired
    UserService userService;


    @RequestMapping(value = "/registration/", method = RequestMethod.POST )
    public ResponseEntity<Void> createClient(@RequestBody user user,UriComponentsBuilder ucBuilder){

        if (userService.isUserExist(user)){
            System.out.println("Client with  firm name " + user.getName_firm()+ " is already exist ");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        userService.saveUser(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/registration/{id__user}").buildAndExpand(user.getId_user()).toUri());
        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }

}
