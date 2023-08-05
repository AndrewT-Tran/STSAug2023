package com.andrew.interfacedemo;

public interface HousePet {
	public default void play() {
		System.out.println("playyin...");
	}
	
	abstract void showAffection();
	abstract void askForFood();
	// these dont have bodies and will  be filled out with the house or cat class
	// abstract has to be completed when the interface is implemented

}
