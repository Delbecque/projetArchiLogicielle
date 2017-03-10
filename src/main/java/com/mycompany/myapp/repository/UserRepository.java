package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the User entity.
 */
@SuppressWarnings("unused")
public interface UserRepository extends MongoRepository<User,String> {

}
