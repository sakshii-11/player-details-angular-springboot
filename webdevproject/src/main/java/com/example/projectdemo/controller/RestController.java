package com.example.projectdemo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.projectdemo.model.User;
import com.example.projectdemo.service.UserService;

@org.springframework.web.bind.annotation.RestController


public class RestController {
   
	@Autowired
	private UserService service;
	
	@PostMapping("/save-user")
	@Transactional
	@CrossOrigin(origins = "http://localhost:4200")
	public String registerUser(@RequestBody User user)  {
		service.saveMyUser(user);
		return "Hello   " + user.getFullname() + " ,  Your registration is successfull ";
		
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	 public User loginUser(@RequestBody User user) throws Exception {
		 String temp = user.getFullname();
		 String temppass = user.getPassword();
		 User userObj = null;
		 if(temp != null && temppass != null) {
			userObj = service.findByFullnameAndPassword(temp, temppass);
		 }
		 if(userObj == null) {
			 throw new Exception("bad credentials");
		 }
		 return userObj;
	 }
	
	
	@GetMapping("/all-users")
	@CrossOrigin(origins = "http://localhost:4200")
	public Iterable<User> showAllUsers(){
		return service.showAllUsers();
	}
	
	@GetMapping("/delete/{fullname}")
    @Transactional
	@CrossOrigin(origins = "http://localhost:4200")
   public Iterable<User> deleteUser(@PathVariable String fullname){
		return service.deleteByFullname(fullname);
	}
	
	@GetMapping("/search/{fullname}")
	@CrossOrigin(origins = "http://localhost:4200")
    public User searchUser(@PathVariable String fullname) {
			return service.findByFullname(fullname);
			
		}
	}

