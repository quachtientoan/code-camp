package com.bidv.rest.webservices.restfullwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer>,CrudRepository<BankEntity, Integer> {

	@Query("SELECT b FROM BankEntity b WHERE b.name LIKE %:bankName%")
	List<BankEntity> findByBankContaining(@Param("bankName") String bankName);

	
}
