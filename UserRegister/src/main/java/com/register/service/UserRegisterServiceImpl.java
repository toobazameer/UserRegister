package com.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.dao.UserRegisterDao;
import com.register.model.User;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{
	
	@Autowired
	private UserRegisterDao userRegisterDao;

	@Override
	public List<User> getUser() {
		return userRegisterDao.findAll();
	}
	
	public User addUser(User user) {
		userRegisterDao.save(user);
		return user;
	}

}
