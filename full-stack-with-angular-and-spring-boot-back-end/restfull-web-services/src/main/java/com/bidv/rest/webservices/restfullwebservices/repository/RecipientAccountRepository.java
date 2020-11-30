package com.bidv.rest.webservices.restfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;

@Repository
public interface RecipientAccountRepository extends JpaRepository<RecipientAccountEntity, Integer>,CrudRepository<RecipientAccountEntity, Integer> {

	
}
