package com.andrew.inheritencedemo;

public class FrontEndDev extends Developer{
	private boolean isArtistic;
	public FrontEndDev() {
		super("This still prints because it is a string and we specified to look for one",10,2100000);
		this.isArtistic = false; 
	}
	public FrontEndDev(String name) {
		super(name, 21, 1000000); 
		this.isArtistic = true;
		this.setAge(30);
		this.giveRaise(600);
	}
	public void displayStatus() {
		super.displayStatus();
		//calls on parent method and polymorph it
		System.out.println("is artistic: " + this.isArtistic);
	}

	public void giveRaise(double amount) {
		this.setSalary(this.getSalary() + amount);
//		this.salary += amount;
	// this is how you would do it on protected. 
	// but you only want to use protected on methods.
	}

}
