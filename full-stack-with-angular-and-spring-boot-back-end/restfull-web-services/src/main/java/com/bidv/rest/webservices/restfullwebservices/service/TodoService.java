package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import com.bidv.rest.webservices.restfullwebservices.entity.TodoEntity;

public interface TodoService {

	public List<TodoEntity> findAll();
	
	public TodoEntity findById(Long id);
	
	public TodoEntity create(TodoEntity entity);

	public boolean delete(Long id);

	public TodoEntity save(TodoEntity todo);
	
	public List<TodoEntity> findByUsername(String username);
}
