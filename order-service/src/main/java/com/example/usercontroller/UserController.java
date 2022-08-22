package com.example.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.entity.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	@GetMapping
	String getUser() {
		
		return "test";
		
	}
	@PostMapping
	
	void saveUser(@RequestBody User user) {
		userservice.save(user);
		Log.debug(user.getName)
		
	}
	
	

}
