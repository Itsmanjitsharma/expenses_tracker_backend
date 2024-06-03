package com.expense_tracker.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expense_tracker.expense_tracker.entity.Transaction;
import com.expense_tracker.expense_tracker.repository.TransactionRepository;


@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> findAll(){
       return transactionRepository.findAll();
    }

    public void addTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }
}
