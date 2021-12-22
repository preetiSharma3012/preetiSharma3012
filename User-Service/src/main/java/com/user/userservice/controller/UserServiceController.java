package com.user.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userservice.entity.User;
import com.user.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid)
	{
		return  userservice.getUser(userid);
	}
}