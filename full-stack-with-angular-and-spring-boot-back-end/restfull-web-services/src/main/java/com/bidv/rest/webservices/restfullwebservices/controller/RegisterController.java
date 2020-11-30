package com.bidv.rest.webservices.restfullwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;
import com.bidv.rest.webservices.restfullwebservices.model.ResponseMessage;
import com.bidv.rest.webservices.restfullwebservices.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {

	@Autowired
	UserService service;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/jpa/users/register")
	public ResponseEntity<ResponseMessage> createUser(@RequestBody UserEntity user) {
		String message = "";

		if (service.findByUsername(user.getUsername()) != null) {
			message = "Your username is exist";
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		service.save(user);
		message = "Successful";
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));

	}
}
