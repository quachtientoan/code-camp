package com.bidv.rest.webservices.restfullwebservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "RECIPIENT_ACCOUNT")
@Entity
public class RecipientAccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@Column(name = "account_number")
	private String accountNumber;
	
//	private Integer bankId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

//	public Integer getBankId() {
//		return bankId;
//	}
//
//	public void setBankId(Integer bankId) {
//		this.bankId = bankId;
//	}
	
	
	

	

}
