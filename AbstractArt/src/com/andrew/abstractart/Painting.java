package com.andrew.abstractart;

public class Painting extends Art {
    private String medium;
    private int year;

    public Painting(String title, String author, String description, String medium, int year) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.medium = medium;
        this.year = year;
    }

    public void viewArt() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Medium: " + medium);
        System.out.println("Year: " + year);
    }
}