package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserRepository.UserRepository;
import com.example.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public void save(User user){
		repository.save(user);
	}
	

}
