package com.register.service;

import java.util.List;

import com.register.model.User;

public interface UserRegisterService {

	List<User> getUser();
	
	User addUser(User user);
}
