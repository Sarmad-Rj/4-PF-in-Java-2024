package sem_project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(100);

        int choice; 
        do {
            System.out.println("\n↝↝↝↝↝↝↝↝↝↝↝↝↝↝↝↝↝");
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Checkout Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); //imp

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = sc.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    library.searchBookByTitle(searchTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to checkout: ");
                    String checkoutTitle = sc.nextLine();
                    library.checkoutBook(checkoutTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
} 