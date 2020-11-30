package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.MoneyTranferRepository;
import com.bidv.rest.webservices.restfullwebservices.service.MoneyTranferService;

@Service
public class MoneyTranferServiceImpl implements MoneyTranferService {

	@Autowired
	MoneyTranferRepository repository;

	@Override
	public List<MoneyTranferEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public MoneyTranferEntity create(MoneyTranferEntity entity) {
		return repository.save(entity);
	}

	@Override
	public MoneyTranferEntity findById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void deleteMultiple(List<Integer> ids) {
		// TODO Auto-generated method stub
		repository.deleteTransWithIds(ids);
	}

	

}
