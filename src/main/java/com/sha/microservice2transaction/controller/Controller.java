package com.sha.microservice2transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.microservice2transaction.model.Transaction;
import com.sha.microservice2transaction.service.ITransactionService;

@RestController
@RequestMapping("api/transaction")
public class Controller {
	
	@Autowired
	private ITransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
		return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{transactionId}")
	public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId) {
		 transactionService.deleteTransaction(transactionId);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("{userId}")
	public ResponseEntity<?> getAllTransactionOfUser(@PathVariable Long userId) {
		return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
	}
	
	

}
