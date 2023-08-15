package com.tran.andrew.safetravel.controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tran.andrew.safetravel.models.Expense;
import com.tran.andrew.safetravel.services.ExpenseServices;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {

	final ExpenseServices expenseServices;

    ExpenseController(ExpenseServices expenseServices) {
        this.expenseServices = expenseServices;
    }

	@RequestMapping("/expenses")
	public String index(Model model) {
		List<Expense> expenses = expenseServices.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

	@GetMapping("/expense")
	public String expense(Model model, @ModelAttribute("expense") Expense expense) {
		List<Expense> expenses = expenseServices.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

	@PostMapping("/api/create")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			expenseServices.createExpense(expense);
		}
		return "redirect:/expenses";
	}

	@PostMapping("/expense/edit/{expenseId}")
	public String editExpense(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseServices.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}

	@PostMapping("/api/update")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			expenseServices.updateExpense(expense);
			return "redirect:/expenses";
		}
	}

	@DeleteMapping("/expense/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseServices.deleteExpense(id);
		return "redirect:/expenses";
	}

	@GetMapping("/expense/{expenseId}")
	public String singlExpense(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseServices.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "singleExpense.jsp";
	}
}



