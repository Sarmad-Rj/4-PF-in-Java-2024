
package pf;
import java.util.*;
public class H_Theory_Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
// Q1: Write a program that inputs three numbers and displays whether all numbers are equal or not by using nested if condition?
//        System.out.println("Enter Three numbers to find if they are equal or not");
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        System.out.print("Enter the third number: ");
//        int c = sc.nextInt();
//        
//        if (a == b) {
//            if (b == c) {
//                System.out.println("All three numbers are equal!");
//            } else {
//                System.out.println("The numbers are not all equal.");
//            }
//        } else {
//            System.out.println("The numbers are not all equal.");
//        }
            
            
// Q2. Write a program that inputs three numbers and displays the maximum number by using logical operators?
//        System.out.println("Enter Three numbers to find the maximum number");
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        System.out.print("Enter the third number: ");
//        int c = sc.nextInt();
//        
//        int max = a;
//        if (b > max && b >= c) {
//            max = b;
//        } else if (c > max && c >= b) {
//            max = c;
//        }
//         System.out.println("The maximum number is: " + max);
        
        

// Q3. Write a program that inputs a character and displays whether it is a vowel or not?
//        System.out.print("Enter a character(to check if it is vowel or not): ");
//        char ch = sc.next().charAt(0);
//
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            System.out.println(ch + " is a vowel.");
//        } else {
//            System.out.println(ch + " is not a vowel.");
//        }
        
        
        
// Q4. Write a program that allows the user to enter any character through the keyboard and determines whether it is a capital letter, small case letter a digit number on a special symbol?
//        System.out.print("Enter any character: ");
//        char  ch = sc.next().charAt(0);
//
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Given character is a small case letter.");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("Given character is a capital case letter.");
//        } else if (ch >= '0' && ch <= '9') {
//            System.out.println("Given character is a digit.");
//        } else {
//            System.out.println("Given character is a special symbol.");
//        }
        
// Q5. Write a program that inputs a character from the user and checks whether it is a vowel or consonant Using Switch Case?
//        System.out.print("Enter a character(to check if it is vowel or not): ");
//        char ch = sc.next().charAt(0);
//
//        switch (ch) {
//            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(ch + " is a vowel.");
//            default -> System.out.println(ch + " is a consonant.");
//        }
        
        
        
// Q6. Write a program that inputs a Floating point number, on operator and another floating point number It displays the result by performing the operation on the given numbers. If the operator is a division, it should check to make sure that the divisor is not equal to zero. If The operator is not to, +, -, * or / then the program should print an error message Using Switch Case?
//        System.out.println("THE CALCULATOR");
//        System.out.print("Enter the first number: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /, %): ");
//        char op = sc.next().charAt(0);
//
//        System.out.print("Enter the second number: ");
//        double b = sc.nextDouble();
//
//        double result;
//
//        switch (op) {
//            case '+':
//                result = a + b;
//                System.out.println("The result is: " + result);
//                break;
//            case '-':
//                result = a - b;
//                System.out.println("The result is: " + result);
//                break;
//            case '*':
//                result = a * b;
//                System.out.println("The result is: " + result);
//                break;
//            case '%':
//                result = a % b;
//                System.out.println("The result is: " + result);
//                break;
//            case '/':
//                if (b != 0) {
//                    result = a / b;
//                    System.out.println("The result is: " + result);
//                } else {
//                    System.out.println("Error: Division by zero is not allowed.");
//                }
//                break;
//            default:
//                System.out.println("Error: Invalid operator. Please use +, -, %, *, or /.");
//        }


        
// Q7. Write a program that inputs marks of a student and display "Pass" if marks are more than 40 and "Fail" otherwise by using conditional operator?   
//        System.out.print("Enter marks(to check if you'r pass): ");
//        int marks = sc.nextInt();
//        
//        String result = (marks > 40)? "Pass" : "Fail";
//        
//        System.out.println("You are "+ result);
        
       
// Q8. Write a program that inputs a number from the user and displays a table of that number using while loop?
//        System.out.println("Bhai BS ka student ho k bhi table nhi attay? Ufff. Well no worries, Enter a number to get the table of it.");
//        System.out.print("\nEnter The Number: ");
//        int num = sc.nextInt();
//        int i = 1; 
//        while (i <= 10){
//            System.out.println(num + " x " + i + " = " + (num*i));
//            i++;
//        }
        
        

// Q9. Write a program that inputs a number from the user and displays the factorial of that number using while loop?
//        System.out.print("Enter the number(to find the feactorial): ");
//        int num = sc.nextInt();
//        int f = 1;
//        int i = num;
//        while (i >= 1){
//            f *= i;
//            i--;
//        }
////        OR
////        int i = 1;
////        while (i <= num){
////            f *= i;
////            i++;
////        }
//        System.out.println("The factorial of " + num + " is " + f);



// Q10. Write a program that displays the sum of the following series using while loop. 1+1/2+1/4 + 1/6+... + 1/100
//        double sum = 0.0;
//        int i = 1;
//
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                sum += 1.0 / i;
//            } else if (i == 1) {
//                sum += 1.0;
//            }
//            i++;
//        }
//
//        System.out.println("The sum of the series is: " + sum);



// Q11 Write a program that inputs a number from user and displays in Fibonacci terms? In Fibonacci sequence, sum of two successive terms gives the third term.
//        System.out.print("Enter the number of terms(to find Fibonacci Sequence ): ");
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//
//        System.out.print("Fibonacci Sequence: " + a + ", " + b);
//
//        int i = 2;
//        while (i < n) {
//            int c = a + b;
//            System.out.print(", " + c);
//            a = b;
//            b = c;
//            i++;
//        }



// Q12 Write a program that inputs a number and checks whether it is a palindrome or not. A palindrome is a number that reads the same backwards as forwards such as 62526 and 4994.
//         System.out.print("Enter a number(to check if it is palindrome or not): ");
//        int n = sc.nextInt();
//        int rn = n;
//        int r = 0;
//
//        while (n != 0) {
//            int digits = n % 10;
//            r = r * 10 + digits;
//            n /= 10;
//        }
//
//        if (rn == r) {
//            System.out.println(rn + " is a palindrome.");
//        } else {
//            System.out.println(rn + " is not a palindrome.");
//        }
        
        
        
// Q13. Write a program that displays product of all odd numbers from 1 to 10 using for loop?
//       int product = 1;
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                product *= i;
//            }
//        }
//        System.out.println("The product of all odd numbers from 1 to 10 is: " + product);


// Q14. Write a program that inputs table number and length of table and then displays the table using for loop?
//        System.out.print("Enter the table number: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the length of the table: ");
//        int l = sc.nextInt();
//
//        for (int i = 1; i <= l; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }



// Q15!! Write a program that finds the sum of the squares of integers from 1 to n. Where n is positive value entered by the user.
//        System.out.print("Enter a positive integer: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum += i * i; 
//        }
//
//        System.out.println("The sum of the squares from 1 to " + n + " is: " + sum);



// Q16. Write a program that inputs a number and checks whether it is a perfect number or not. A perfect number is a number that is numerically equal to the sum of its divisors. For example, 6 is a perfect number because the divisors of 6 are 1,2,3 and 1+2+3=6.
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//
//        if (sum == n) {
//            System.out.println(n + " is a perfect number.");
//        } else {
//            System.out.println(n + " is not a perfect number.");
//        }



// Q17. Write a program that inputs an integer and prints if it is prime or composite. A number is prime if it has factors 1 and itself, otherwise it is a composite number.
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int divisorCount = 0;
        if (number <= 1) {
            System.out.println(number + " is neither prime nor composite.");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    divisorCount++;
                    break;
                }
            }

            if (divisorCount == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is a composite number.");
            }
        }
        System.out.println(divisorCount);
        



// Q18. Write a program that displays the following output using nested for loop.
//1=1
//1+2 = 3
//1+2+3 = 6
//1+2+3+4 = 10
//1+2+3+4+5 = 15
//        int sum;
//        for (int i = 1; i <= 5; i++) {
//            sum = 0;
//            for (int j = 1; j <= i; j++) {
//                sum += j;
//                System.out.print(j);
//                if (j < i) {
//                    System.out.print("+");
//                }
//            }
//            System.out.println(" = " + sum);
//        }
        

// Q19 
//        for (int i = 0; i < 5; i++) { // outer for rows
//            for (int j = 0; j < 25; j++) { // inner for columns
//                System.out.print("*");
//            }
//            System.out.println(); 
//        }



//Q20

//        int rows = 5;
//        
//        for (int i = 1; i <= rows; i++) { 
//            for (int j = 1; j < i; j++) { 
//                System.out.print(" ");
//            }
//            for (int k = rows; k >= i; k--) { 
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
    }
}
