package com.andrew.abstractclassdemo;

public abstract class Payment {
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
		//anytime you have a body you need getters and setters
	}
	public void paymentDetails() {
		System.out.println("Payment Amount: " + this.amount);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
