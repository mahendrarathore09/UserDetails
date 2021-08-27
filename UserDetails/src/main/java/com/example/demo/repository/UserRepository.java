package com.example.demo.repository;


import org.springframework.stereotype.Component;

import com.example.demo.entities.User;

@Component
public interface UserRepository {

	public User getUserById(int id);

	public User editUser(User user);

	public int deleteUser(int id);

	public User addUser(User user);
}
