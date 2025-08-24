package pf;

import java.util.Scanner;

public class x_muzzamil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = {"Product A", "Product B", "Product C"};
        double[] productPrices = {10.99, 19.99, 29.99};


        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.next();

        System.out.println("Product List:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println((i + 1) + ". " + productNames[i] + " - $" + productPrices[i]);
        }

        System.out.print("Enter the product number you want to purchase: ");
        int productNumber = scanner.nextInt() - 1; // Adjust for array index

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = productPrices[productNumber] * quantity;

        System.out.println("Total Cost: $" + totalCost);
        System.out.print("Enter the amount paid: $");
        double amountPaid = scanner.nextDouble();

        if (amountPaid >= totalCost) {
            double change = amountPaid - totalCost;
            System.out.println("Payment successful. Change: $" + change);
            System.out.println("\nReceipt");
            System.out.println("Customer ID: " + customerId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Product: " + productNames[productNumber]);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("Amount Paid: $" + amountPaid);
            System.out.println("Change: $" + change);
        } else {
            System.out.println("Insufficient payment. Please pay the full amount.");
        }

        scanner.close();
    }
}