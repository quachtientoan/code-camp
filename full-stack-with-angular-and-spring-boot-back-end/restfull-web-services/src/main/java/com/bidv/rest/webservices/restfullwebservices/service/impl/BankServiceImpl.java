package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.BankRepository;
import com.bidv.rest.webservices.restfullwebservices.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository repository;

	@Override
	public List<BankEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public List<BankEntity> findByBankContaining(String bankName) {
		// TODO Auto-generated method stub
		return repository.findByBankContaining(bankName);
	}

	@Override
	public BankEntity findById(Integer receivingBank) {
		// TODO Auto-generated method stub
		return repository.findById(receivingBank).orElse(new BankEntity());
	}


}
