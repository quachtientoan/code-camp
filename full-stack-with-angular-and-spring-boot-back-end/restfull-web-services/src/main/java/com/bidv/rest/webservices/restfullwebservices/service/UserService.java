package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;

public interface UserService {

	public List<UserEntity> findAll();
	
	public UserEntity findById(Long id);
	
	public UserEntity create(UserEntity entity);

	public boolean delete(Long id);

	public UserEntity save(UserEntity entity);
	
	public UserEntity findByUsername(String username);
}
