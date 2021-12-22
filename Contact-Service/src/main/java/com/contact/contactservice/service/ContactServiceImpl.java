package com.contact.contactservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contacts;
@Service
public class ContactServiceImpl implements ContactService {

	List<Contacts> list = List.of(
			
			new Contacts(100L,"herry@gmail.com","Herry",1001L),
			new Contacts(101L,"herry1@gmail.com","Herry1",1001L),
			new Contacts(102L,"Jerry@gmail.com","Jerry",1002L),
			new Contacts(103L,"Jerry1@gmail.com","Jerry1",1002L),
			new Contacts(104L,"Lerry1@gmail.com","Lerry1",1003L),
			new Contacts(105L,"Lerry@gmail.com","Lerry",1003L),
			new Contacts(106L,"Kerry@gmail.com","Kerry",1004L)
			);	
						
	@Override
	public List<Contacts> getUsercontact(Long userid) {
		// TODO Auto-generated method stub
		return list.stream().filter(contacts -> contacts.getUserid().equals(userid)).collect(Collectors.toList());
	}

}
