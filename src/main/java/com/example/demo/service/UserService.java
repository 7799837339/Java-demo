package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
import com.example.demo.vo.User;

@Service
public class UserService {
	
	public UserRepository userRespository;

	public User addUser(User user) {
		return userRespository.save(user);
	}

	public User updateUser(User user) {
		return userRespository.save(user);
	}

	public void deleteUser(User user) {
		userRespository.softDelete(user.getUserId());
	}
	

}
