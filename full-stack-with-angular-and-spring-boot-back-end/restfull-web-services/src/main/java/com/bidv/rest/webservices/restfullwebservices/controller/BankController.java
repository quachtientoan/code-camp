package com.bidv.rest.webservices.restfullwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;
import com.bidv.rest.webservices.restfullwebservices.service.BankService;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class BankController {

	@Autowired
	BankService service;

	@GetMapping("/api/user/{username}/banks")
	public List<BankEntity> getAll(@PathVariable("username") String username) {
		return service.findAll();
	}
	
	@GetMapping("/api/user/{username}/banks/{bankName}")
	public List<BankEntity> searchBanks(@PathVariable("username") String username,@PathVariable("bankName") String bankName){
		return service.findByBankContaining(bankName);
	}


}
