package com.example.projectdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.projectdemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
	public Iterable<User> deleteByFullname(String fullname);
     public User findByFullname(String fullname);
     public User findByFullnameAndPassword(String fullname, String password);

}

