package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userservicefallback")
	public String userservicefallback()
	{
		return "User Service failing";
	}
	
	@GetMapping("/contactservicefallback")
	public String contactservicefallback()
	{
		return "Contact Service failing";
	}
	

}
