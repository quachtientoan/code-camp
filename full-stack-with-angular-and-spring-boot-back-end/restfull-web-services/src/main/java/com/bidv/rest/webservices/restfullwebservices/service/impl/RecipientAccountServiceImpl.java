package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.CustomerEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.RecipientAccountRepository;
import com.bidv.rest.webservices.restfullwebservices.service.RecipientAccountService;

@Service
public class RecipientAccountServiceImpl implements RecipientAccountService {

	@Autowired
	RecipientAccountRepository repository;

	@Override
	public List<RecipientAccountEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public RecipientAccountEntity findById(Integer sourceAccountId) {
		return repository.findById(sourceAccountId).orElse(new RecipientAccountEntity());
	}



}
