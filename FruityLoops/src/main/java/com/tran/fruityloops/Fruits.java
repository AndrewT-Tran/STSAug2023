package com.tran.fruityloops;

import java.util.ArrayList;

public class Fruits {
	private String name;
	private double price;
	private static ArrayList<Fruits> allFruits = new ArrayList<Fruits>();
	
	public Fruits(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static void add(Fruits fruit) {
		allFruits.add(fruit);
	}
	
	public static ArrayList<Fruits> getAllFruits() {
		return allFruits;
	}
}


