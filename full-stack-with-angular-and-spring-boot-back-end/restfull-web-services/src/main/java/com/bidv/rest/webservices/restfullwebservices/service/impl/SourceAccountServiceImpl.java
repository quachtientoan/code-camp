package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.CustomerEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.CustomerRepository;
import com.bidv.rest.webservices.restfullwebservices.repository.SourceAccountRepository;
import com.bidv.rest.webservices.restfullwebservices.service.CustomerService;
import com.bidv.rest.webservices.restfullwebservices.service.SourceAccountService;

@Service
public class SourceAccountServiceImpl implements SourceAccountService {

	@Autowired
	SourceAccountRepository repository;

	@Override
	public List<SourceAccountEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public SourceAccountEntity findById(Integer sourceAccountId) {
		// TODO Auto-generated method stub
		return repository.findById(sourceAccountId).orElse(new SourceAccountEntity());
	}


}
