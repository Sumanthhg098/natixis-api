package com.user.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.crud.service.UserService;

@CrossOrigin(origins="*")
@RestController
public class UserControlller {
     @Autowired
	private UserService userService;
     
     
     @GetMapping("/pass")
     public String getPass(String user)
     {
    	 return userService.getPassword(user);
     }
     
}
