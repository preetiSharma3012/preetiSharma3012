package com.contact.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contactservice.entity.Contacts;
import com.contact.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactServiceController {
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/user/{userId}")
	public List<Contacts> getlistofcontacts(@PathVariable("userId") Long userid)
	{
		return contactservice.getUsercontact(userid);
	}

}
