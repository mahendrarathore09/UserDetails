package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping(value = "/{user_id}")
	public User getUserById(@PathVariable("user_id") int user_id) {
		return service.getUser(user_id);
	}

	@PostMapping(value = "/")
	public User addTrade(@RequestBody User user) {
		return service.newUser(user);
	}

	@PutMapping(value = "/")
	public User editTrade(@RequestBody User user) {
		return service.saveUser(user);
	}

	@DeleteMapping(value = "/{user_id}")
	public int deleteOrder(@PathVariable int user_id) {
		return service.deleteUser(user_id);
	}

}