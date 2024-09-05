package org.example.Library_management;

public class Library{

    private Book[] bookArray;
    private int bookCount;

    public Library() {
        bookArray = new Book[10];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if(bookCount < bookArray.length) {
            bookArray[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Book can not be added::");
        }
    }

    public void removeBook(String ISBN) {
        for(int i=0;i<bookCount;i++) {
            if(bookArray[i].getISBN().equals(ISBN)) {
                bookArray[i] = bookArray[bookCount - 1];
                bookArray[bookCount - 1] = null;
                bookCount--;
            }
        }

        if(findBookByISBN(ISBN)) {
            System.out.println("Sorry! ISBN number is not found!!.");
        }
    }

    public boolean findBookByISBN(String ISBN) {
        for(int i=0;i<bookCount;i++) {
            return bookArray[i].getISBN().equals(ISBN);
        }
        return false;
    }

    public void getAllAvailableBooks() {
        if(bookArray.length == 0) {
            System.out.println("You need to add the books in the Array");
        }

        for(int i=0;i<bookArray.length;i++) {
            System.out.println(bookArray[i]);
        }
    }
}
