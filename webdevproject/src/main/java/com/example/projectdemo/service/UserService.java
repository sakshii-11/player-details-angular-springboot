package com.example.projectdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.model.User;
import com.example.projectdemo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	public UserService() {

}

	public void saveMyUser(User user) {
		repo.save(user);
	}
	
	public Iterable<User> showAllUsers(){
		return repo.findAll();
	}
	
	public Iterable<User> deleteByFullname(String fullname){
		repo.deleteByFullname(fullname);
		return repo.findAll();
	}
	
	public User findByFullname(String fullname) 
	{
		 return repo.findByFullname(fullname);
	}

 public User findByFullnameAndPassword(String fullname, String password) 
{
	 return repo.findByFullnameAndPassword(fullname,password);
}
}
