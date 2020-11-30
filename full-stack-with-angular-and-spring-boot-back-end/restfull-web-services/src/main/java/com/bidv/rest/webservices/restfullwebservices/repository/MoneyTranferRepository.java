package com.bidv.rest.webservices.restfullwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;

@Repository
public interface MoneyTranferRepository extends JpaRepository<MoneyTranferEntity, Integer>,CrudRepository<MoneyTranferEntity, Integer> {

	@Query("delete from MoneyTranferEntity u where u.id in ids")
	void deleteTransWithIds(@Param("ids") List<Integer> ids);
}
