package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;


public interface SourceAccountService {

	public List<SourceAccountEntity> findAll();

	public SourceAccountEntity findById(Integer sourceAccountId);
	
//	public CustomerEntity findById(Integer id);
//	
//	public CustomerEntity create(CustomerEntity entity);
//
//	public boolean delete(Integer cusId);
//
//	public CustomerEntity save(CustomerEntity customer);
}
