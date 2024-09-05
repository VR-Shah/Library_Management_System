package org.example.Library_management;

public class MainClass {

    public static void main(String[] args) {

        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("Java Programming", "Author1", "12345", true);
        Book book2 = new Book("Python Programming", "Author2", "67890", true);
        ReferenceBook refBook1 = new ReferenceBook("Data Science", "Author3", "11223", true, "Technology");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(refBook1);

        // Display the list of all available books
        System.out.println("\nList of available books:");
        library.getAllAvailableBooks();

        // Remove a book and attempt to list books again
        library.removeBook("67890");
        System.out.println("\nList of available books after removal:");
        library.getAllAvailableBooks();


    }
}
