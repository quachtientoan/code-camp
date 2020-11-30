package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.TodoEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.TodoRepository;
import com.bidv.rest.webservices.restfullwebservices.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository repository;

	@Override
	public List<TodoEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public TodoEntity create(TodoEntity entity) {
		return repository.save(entity);
	}

	@Override
	public boolean delete(Long id) {
		TodoEntity entity = findById(id);
		if(entity != null) {
			repository.delete(entity);
			return true;
		}
		
		return false;
	}

	@Override
	public TodoEntity findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(new TodoEntity());
	}

	@Override
	public TodoEntity save(TodoEntity todo) {
		// TODO Auto-generated method stub
		return repository.save(todo);
	}

	@Override
	public List<TodoEntity> findByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.findByUsername(username);
	}

}
