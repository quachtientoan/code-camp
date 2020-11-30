package com.bidv.rest.webservices.restfullwebservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bidv.rest.webservices.restfullwebservices.entity.TodoEntity;
import com.bidv.rest.webservices.restfullwebservices.service.impl.TodoHardcodedService;

/**
 * 
 * @author BIDVAdmin
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoHardCodeController {

	@Autowired
	private TodoHardcodedService todoHardcodedService;

	@GetMapping("/users/{username}/todos")
	public List<TodoEntity> getAllTodos(@PathVariable("username") String username) {
		return todoHardcodedService.findAll();
	}

	@GetMapping("/users/{username}/todos/{id}")
	public TodoEntity getTodo(@PathVariable("username") String username, @PathVariable("id") long id) {
		return todoHardcodedService.findById(id);
	}

	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable("username") String username, @PathVariable("id") long id) {
		TodoEntity todo = todoHardcodedService.deleteById(id);
		if (todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/users/{username}/todos/{id}")
	public ResponseEntity<TodoEntity> updateTodo(@PathVariable("username") String username, @PathVariable("id") long id,
			@RequestBody TodoEntity todo) {

		TodoEntity todoUpdate = todoHardcodedService.save(todo);
		return new ResponseEntity<TodoEntity>(todoUpdate, HttpStatus.OK);
	}

	@PostMapping("/users/{username}/todos")
	public ResponseEntity<Void> createTodo(@PathVariable("username") String username, @RequestBody TodoEntity todo) {

		TodoEntity createTodo = todoHardcodedService.save(todo);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(createTodo.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

}
