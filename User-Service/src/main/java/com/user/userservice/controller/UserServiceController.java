package com.user.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.userservice.entity.User;
import com.user.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid)
	{
		User user= userservice.getUser(userid);
		List contacts = resttemplate.getForObject("http://contact-service/contact/user/" + userid, List.class);
		
		user.setContacts(contacts);
			
		return user;
	}
}