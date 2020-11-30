package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;


public interface BankService {

	public List<BankEntity> findAll();

	public List<BankEntity> findByBankContaining(String bankName);

	public BankEntity findById(Integer receivingBank);

	
}
