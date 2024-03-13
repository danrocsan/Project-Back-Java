package com.danielrocha.helpdesk.api.repository;

import com.danielrocha.helpdesk.api.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);

	User findOne(String id);

	void delete(String id);

}
