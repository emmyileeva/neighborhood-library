package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create array to hold 20 books
        Book[] books = new Book[20];

        // Iterate through the array and create Book objects
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i + 1, "ISBN" + (i + 1), "Title" + (i + 1));
        }
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the Home Screen
            System.out.println("\nStore Home Screen:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Process user choice
            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (Book book : books) {
                        if (!book.isCheckedOut()) {
                            System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nChecked Out Books:");
                    for (Book book : books) {
                        if (book.isCheckedOut()) {
                            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Checked out to: " + book.getCheckedOutTo());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
