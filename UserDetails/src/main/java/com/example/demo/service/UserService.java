package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public User getUser(int user_id) {
		return repository.getUserById(user_id);
	}

	public User saveUser(User user) {
		return repository.editUser(user);
	}

	public User newUser(User user) {
		return repository.addUser(user);
	}

	public int deleteUser(int user_id) {
		return repository.deleteUser(user_id);
	}
}
