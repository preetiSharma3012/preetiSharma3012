package com.user.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			
			new User(1001L,"Jim","990089"),
			new User(1002L,"Tim","955464"),
			new User(1003L,"Lim","456777"),
			new User(1004L,"Pic","122344")			
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
