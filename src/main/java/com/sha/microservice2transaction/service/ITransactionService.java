package com.sha.microservice2transaction.service;

import java.util.List;

import com.sha.microservice2transaction.model.Transaction;

public interface ITransactionService {

	Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
