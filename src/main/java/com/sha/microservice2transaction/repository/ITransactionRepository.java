package com.sha.microservice2transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.microservice2transaction.model.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Long>{
	// <Class>findBy+fieldName... example query.
	List<Transaction> findAllByUserId(Long userId);
}
