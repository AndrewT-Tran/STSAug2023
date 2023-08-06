package com.andrew.abstractart;

	class Sculpture extends Art {
    private String material;
    private int height;

    public Sculpture(String title, String author, String description, String material, int height) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.material = material;
        this.height = height;
    }

    @Override

    public void viewArt() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
    }
}
