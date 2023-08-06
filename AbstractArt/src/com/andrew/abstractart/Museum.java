package com.andrew.abstractart;

public class Museum {
	public static void main(String[] args) {
		Painting painting = new StarryNightPainting("Vincent van Gogh", "A painting of a starry night sky",
				"Oil on canvas", 1889);
		painting.viewArt();

		Sculpture sculpture = new DavidSculpture("Michelangelo", "A sculpture of the biblical hero David", "Marble");
		sculpture.viewArt();
	}
}

class StarryNightPainting extends Painting {
	public StarryNightPainting(String artist, String title, String medium, int year) {
		super("Starry Night", artist, title, medium, year);
	}

	@Override
	public void viewArt() {
		System.out.println("This is a beautiful painting of a starry night sky.");
	}
}

class DavidSculpture extends Sculpture {
	public DavidSculpture(String artist, String title, String medium) {
		super("David", artist, title, medium);
	}

	@Override
	public void viewArt() {
		System.out.println("This is a stunning sculpture of the biblical hero David.");
	}
}