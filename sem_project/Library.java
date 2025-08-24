package sem_project;

public class Library {
    private Book[] books;
    int numBooks;
    private boolean[] isCheckedOut; 

    public Library(int capacity) { // Capacity for the number of books
        books = new Book[capacity];
        numBooks = 0;
        isCheckedOut = new boolean[capacity]; // Initialize isCheckedOut in constructor
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println("Title: " + books[i].title);
                System.out.println("Author: " + books[i].author);
                System.out.println("ISBN: " + books[i].ISBN);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void checkoutBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (!isCheckedOut[i]) { // Check if book is not already checked out
                    isCheckedOut[i] = true;
                    System.out.println("Book checked out successfully.");
                    return; 
                } else {
                    System.out.println("Book is already checked out.");
                    return; 
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (isCheckedOut[i]) { // Check if book is currently checked out
                    isCheckedOut[i] = false;
                    System.out.println("Book returned successfully.");
                    return; 
                } else {
                    System.out.println("Book is not currently checked out.");
                    return; 
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("List of Books:");
            for (int i = 0; i < numBooks; i++) {
                System.out.println("Title: " + books[i].title + ", Author: " + books[i].author + 
                                   (isCheckedOut[i] ? " (Checked Out)" : "")); // Display checkout status
            }
        }}} 