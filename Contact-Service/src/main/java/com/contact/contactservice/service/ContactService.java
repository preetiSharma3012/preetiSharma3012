package com.contact.contactservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contacts;


public interface ContactService {
	
	List<Contacts> getUsercontact(Long userid);

}
