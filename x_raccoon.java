package pf;

import java.util.Scanner;

public class x_raccoon {
    static String[] menuItems = {"Burger", "Pizza", "Pasta", "Fries", "Soft Drink"};
    static int[] prices = {350, 1200, 450, 200, 80};
    static int[] quantities = new int[menuItems.length];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Restaurant Menu ***");
            System.out.println("1. View The Menu");
            System.out.println("2. Take The Order");
            System.out.println("3. Show The Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    takeOrder(scanner);
                    break;
                case 3:
                    showBill();
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    static void viewMenu() {
        System.out.println("\n*** Menu ***");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - Rs %d\n", i + 1, menuItems[i], prices[i]);
        }
    }

    static void takeOrder(Scanner scanner) {
        viewMenu();
        System.out.print("\nEnter the number of the item you want to order: ");
        int itemNumber = scanner.nextInt();
        if (itemNumber < 1 || itemNumber > menuItems.length) {
            System.out.println("Invalid item number!");
        } else {
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero!");
            } else {
                quantities[itemNumber - 1] += quantity;
                System.out.println("You added " + quantity + " x " + menuItems[itemNumber - 1] + " to your order.");
            }
        }
    }

    static void showBill() {
        System.out.println("\n*** Bill ***");
        double total = 0;
        for (int i = 0; i < menuItems.length; i++) {
            if (quantities[i] > 0) {
                int itemTotal = quantities[i] * prices[i]; 
                total += itemTotal;
                System.out.printf("%d x %s - Rs %.2f\n", quantities[i], menuItems[i], itemTotal);
            }
        }
        System.out.printf("Total Bill: Rs %.2f\n", total);
    }
}