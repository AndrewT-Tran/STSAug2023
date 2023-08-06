package com.andrew.abstractart;

public abstract class Museum {
	class Sculpture extends Art {
		  private String material;

		  public Sculpture(String title, String author, String description, String material) {
		    this.title = title;
		    this.author = author;
		    this.description = description;
		    this.material = material;
		  }

		  public void viewArt() {
		    System.out.println("Title: " + title);
		    System.out.println("Author: " + author);
		    System.out.println("Description: " + description);
		    System.out.println("Material: " + material);
		  }
		}
}
