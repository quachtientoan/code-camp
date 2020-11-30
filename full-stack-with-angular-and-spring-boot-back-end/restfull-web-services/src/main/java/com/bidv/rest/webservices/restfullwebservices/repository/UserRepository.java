package com.bidv.rest.webservices.restfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>,CrudRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);

	
}
