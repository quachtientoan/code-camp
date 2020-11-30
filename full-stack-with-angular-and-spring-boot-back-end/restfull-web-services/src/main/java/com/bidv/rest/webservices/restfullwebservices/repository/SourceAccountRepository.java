package com.bidv.rest.webservices.restfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;

@Repository
public interface SourceAccountRepository extends JpaRepository<SourceAccountEntity, Integer>,CrudRepository<SourceAccountEntity, Integer> {

	
}
