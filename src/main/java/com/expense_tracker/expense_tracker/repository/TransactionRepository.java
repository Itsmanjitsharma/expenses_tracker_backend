package com.expense_tracker.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense_tracker.expense_tracker.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long>{

} 
