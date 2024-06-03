package com.expense_tracker.expense_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense_tracker.expense_tracker.entity.Transaction;
import com.expense_tracker.expense_tracker.service.TransactionService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;


@RestController
@CrossOrigin("http://localhost:3000")
public class ExpenseTrackerController {
     
    @Autowired
    TransactionService transactionService;

    @PostMapping("/save")
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction){
        System.out.println("save method get called");
        transactionService.addTransaction(transaction);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionService.findAll();
    }
    
}
