# Neighborhood Library

This project is a Java console application that simulates a neighborhood library system. Users can check out and return books using an honor system. It keeps track of available and checked out books based on user input.

---

## 📚 Features Included

### 1. 🏠 Home Screen
- Offers a menu with three main options:
  - Show Available Books
  - Show Checked Out Books
  - Exit the application

### 2. 📖 Available Books Screen
- Displays all books that are not currently checked out
- Allows users to select a book to check out by entering its ID and their name
- Updates book status to `checked out` with the provided name

### 3. 📕 Checked Out Books Screen
- Lists all books that are currently checked out
- Displays the name of the person who checked them out
- Allows users to check in books by entering the book’s ID
- Resets the book’s status and removes the checkout name

---

## ✨ Interesting Code Highlight

```java
  public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
        } else {
            System.out.println("Book is already checked out to " + checkedOutTo);
        }
    }
```

## 💡 Why it's interesting
This method clearly handles the logic of checking out a book, but it also prevents users from checking out a book that's already checked out. It's a great example of simple yet effective control flow using conditionals to protect program behavior and ensure data integrity.

