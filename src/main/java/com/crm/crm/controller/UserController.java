package com.crm.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.model.User;
import com.crm.crm.service.UserService;

@CrossOrigin(origins = "http://localhost:8899")
@RestController
@RequestMapping
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);		
	}
	
	
	

}
