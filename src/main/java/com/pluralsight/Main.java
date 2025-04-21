package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create array to hold 20 books
        Book[] books = new Book[20];

        // Iterate through the array and create Book objects
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i + 1, "ISBN" + (i + 1), "Title" + (i + 1));
        }
    }
}
