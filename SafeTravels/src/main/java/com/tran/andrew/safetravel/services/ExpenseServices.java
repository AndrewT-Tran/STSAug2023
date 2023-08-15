package com.tran.andrew.safetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tran.andrew.safetravel.models.Expense;
import com.tran.andrew.safetravel.repository.ExpenseRepository;

@Service
public class ExpenseServices {
	private final ExpenseRepository expenseRepository;

	public ExpenseServices(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}

	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}

	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}

	public Expense updateExpense(Expense expense) {
		Optional<Expense> optionalExpense = expenseRepository.findById(expense.getId());

		if (optionalExpense.isPresent()) {

			Expense thisExpense = optionalExpense.get();

			thisExpense.setTitle(expense.getTitle());
			thisExpense.setDescription(expense.getDescription());
			thisExpense.setVendor(expense.getVendor());
			thisExpense.setAmount(expense.getAmount());

			return expenseRepository.save(thisExpense);
		} else {
			return null;
		}
	}
}
