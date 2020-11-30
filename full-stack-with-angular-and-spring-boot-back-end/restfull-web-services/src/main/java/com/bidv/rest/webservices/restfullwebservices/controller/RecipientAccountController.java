package com.bidv.rest.webservices.restfullwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.service.RecipientAccountService;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class RecipientAccountController {

	@Autowired
	RecipientAccountService service;

	@GetMapping("/api/user/{username}/recipient-account")
	public List<RecipientAccountEntity> getAll(@PathVariable("username") String username) {
		return service.findAll();
	}

}
