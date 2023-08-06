package com.andrew.abstractart;

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
	  
	  public class Museum {
		public static void main(String[] args) {
			new Painting("Starry Night", "Vincent van Gogh", "Oil on canvas", "Oil");
			new Painting("The Persistence of Memory", "Salvador Dali", "Oil on canvas", "Oil");
			new Painting("The Scream", "Edvard Munch", "Oil, tempera, and pastel on cardboard", "Oil");

			new Sculpture("David", "Michelangelo", "Marble statue of David", "Marble");
			new Sculpture("The Thinker", "Auguste Rodin", "Bronze statue of a man in deep thought", "Bronze");
		}
		}
	  
	}
