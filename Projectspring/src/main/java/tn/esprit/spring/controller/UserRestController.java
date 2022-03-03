package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.User;
import tn.esprit.spring.service.IServiceUser;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	IServiceUser service;
	
	
	
	
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User user){
	User x=service.addUser(user);
	 return x;
		}
}
