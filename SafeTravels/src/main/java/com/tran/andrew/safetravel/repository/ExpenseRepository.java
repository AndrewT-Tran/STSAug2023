package com.tran.andrew.safetravel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tran.andrew.safetravel.models.Expense;
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
@Override
List<Expense> findAll();
}
