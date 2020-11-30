/**
 * 
 */
package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.TodoEntity;

/**
 * @author BIDVAdmin
 *
 */

@Service
public class TodoHardcodedService {
	
	
	private static List<TodoEntity> todos = new ArrayList<TodoEntity>();
	private static long idCounter = 0;
	
	

	static {
		todos.add(new TodoEntity(++idCounter, "in28minutes","Learn to Dance 2", new Date(), false ));
		todos.add(new TodoEntity(++idCounter, "in28minutes","Learn about Microservices 2", new Date(), false ));
		todos.add(new TodoEntity(++idCounter, "in28minutes","Learn about Angular", new Date(), false ));
	}
	
	public List<TodoEntity> findAll() {
		return todos;
	}

	public TodoEntity save(TodoEntity TodoEntity) {
		if(TodoEntity.getId()==-1 || TodoEntity.getId()==0) {
			TodoEntity.setId(++idCounter);
			todos.add(TodoEntity);
		} else {
			deleteById(TodoEntity.getId());
			todos.add(TodoEntity);
		}
		return TodoEntity;
	}
	
	public TodoEntity deleteById(long id) {
		TodoEntity TodoEntity = findById(id);
		
		if(TodoEntity==null) return null;
		
		if(todos.remove(TodoEntity)) {
			return TodoEntity;
		}
		
		return null;
	}

	public TodoEntity findById(long id) {
		for(TodoEntity TodoEntity:todos) {
			if(TodoEntity.getId() == id) {
				return TodoEntity;
			}
		}
		
		return null;
	}
}
