package com.andrew.abstractart;

public class Test {
    public static void main(String[] args) {
        Painting painting = new Painting("Starry Night", "Vincent van Gogh", "A painting of a starry night sky",
                "Oil on canvas", 1889);
        painting.viewArt();

        Sculpture sculpture = new Sculpture("David", "Michelangelo", "A sculpture of the biblical hero David",
                "Marble");
        sculpture.viewArt();
    }
}