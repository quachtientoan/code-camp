package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.UserRepository;
import com.bidv.rest.webservices.restfullwebservices.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public List<UserEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public UserEntity create(UserEntity entity) {
		return repository.save(entity);
	}

	@Override
	public boolean delete(Long id) {
		UserEntity entity = findById(id);
		if(entity != null) {
			repository.delete(entity);
			return true;
		}
		
		return false;
	}

	@Override
	public UserEntity findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(new UserEntity());
	}

	@Override
	public UserEntity save(UserEntity todo) {
		// TODO Auto-generated method stub
		return repository.save(todo);
	}

	@Override
	public UserEntity findByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.findByUsername(username);
	}

}
