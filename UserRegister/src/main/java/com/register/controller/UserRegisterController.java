package com.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.model.User;
import com.register.service.UserRegisterService;

@RestController
public class UserRegisterController {
	
	@Autowired
	private UserRegisterService userRegisterService;
	
	@GetMapping("/check")
	public List<User> getUser(){
		return this.userRegisterService.getUser();
	}
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user) {
		return this.userRegisterService.addUser(user);
	}

}
