package com.andrew.interfacedemo;

public class Dog extends Pet implements HousePet {
	public Dog() {
		super("rando dog name", "dog");

	}

	public Dog(String name) {
		super(name, "dog");
	}

	@Override
	public void showAffection() {
		System.out.println("rubs you");

	}

	@Override
	public void askForFood() {
		System.out.println("Stares at you with deep gaze");

	}
}
