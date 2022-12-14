package com.token.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//logic to get the username and password from the database can be written here
		
		return new User("admin","password", new ArrayList<>()); //we will fetch the user's details using the username thats passed here
		//password and all and the arraylist is for other details that are present against the username
	}

}
