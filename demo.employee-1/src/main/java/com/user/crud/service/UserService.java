package com.user.crud.service;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.crud.model.User;
import com.user.crud.repo.UserRepo;

@Service
public class UserService {
    @Autowired
	private UserRepo userRepo;
	public String getPassword(String user) {
		
		List<User> l =  userRepo.findAll();
		for(User x:l)
		{
			if(x.getName()==user) return x.getPassword();
		}
		return null;
	}

}
