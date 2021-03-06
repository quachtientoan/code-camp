package com.bidv.rest.webservices.restfullwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.service.SourceAccountService;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class SourceAccountController {

	@Autowired
	SourceAccountService service;

	@GetMapping("/api/user/{username}/source-account")
	public List<SourceAccountEntity> getAll(@PathVariable("username") String username) {
		return service.findAll();
	}

//	@GetMapping("/api/user/{username}/customers/{id}")
//	public CustomerEntity getCustomer(@PathVariable("username") String username, @PathVariable("id") Integer id) {
//		return service.findById(id);
//	}
//
//	@DeleteMapping("/api/user/{username}/customer/{id}")
//	public void delete(@PathVariable("username") String username, @PathVariable("id") Integer id) {
//		service.delete(id);
//	}
//
//	@PutMapping(value = "/api/user/{username}/customers/{id}")
//	public ResponseEntity<CustomerEntity> update(@PathVariable("username") String username,
//			@PathVariable("id") Integer id, @RequestBody CustomerEntity customer) {
//
//		try {
//			CustomerEntity entity = service.findById(id);
//			if (entity == null) {
//				return new ResponseEntity<CustomerEntity>(customer, HttpStatus.BAD_REQUEST);
//			}
//
//			service.save(customer);
//			return new ResponseEntity<CustomerEntity>(customer, HttpStatus.OK);
//		}catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
//		}
//		
//	}
//	
//	@PostMapping("/api/user/{username}/customers")
//	public ResponseEntity<Void> update(@PathVariable("username") String username,
//			 @RequestBody CustomerEntity customer) {
//		CustomerEntity createCus =  service.save(customer);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(createCus.getId())
//				.toUri();
//
//		return ResponseEntity.created(uri).build();
//	}

}
