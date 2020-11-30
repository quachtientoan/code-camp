package com.bidv.rest.webservices.restfullwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bidv.rest.webservices.restfullwebservices.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long>,CrudRepository<TodoEntity, Long> {

	List<TodoEntity> findByUsername(String username);

	
}
