package com.danielrocha.helpdesk.api.service;

import org.springframework.data.domain.Page;

import com.danielrocha.helpdesk.api.entity.User;

public interface UserService {
	
	User findByEmail(String email);
	
	User vreateOrUpdate(User user);
	
	User findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
	

}
