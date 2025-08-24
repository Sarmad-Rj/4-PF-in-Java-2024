
package pf;
import java.util.*;
public class G_Lab_Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Q1. Write a program that inputs two numbers and finds whether both are equal.
//        System.out.println("Enter two numbers and finds whether both are equal.");
//        System.out.print("Enter The First Number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter The Second Number: ");
//        int b = sc.nextInt();
//        
//        if (a == b) {
//            System.out.println("Both Numbers Are Equal");
//        }
//        else {
//            System.out.println("Both numbers are not equal!");
//        }



// Q2. Write a program that inputs two numbers and finds if second number is square of first.
//        System.out.println("Enter two numbers and finds if second number is square of first.");
//        System.out.print("Enter The First Number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter The Second Number: ");
//        int b = sc.nextInt();
//
//        if (b == a*a) {
//            System.out.println("Your given 2nd number is the square of first.");
//        }
//        else {
//            System.out.println("Your given 2nd number is not the square of first!");
//        }



// Q3. Write a program that inputs marks of three subjects. If the average of marks is more than 80, it displays two messages "You are above standard!" and "Admission granted"
//        System.out.println("Enter Your Three Subject's Marks To Find If Your Are On Merit");
//        System.out.print("1st Subject: ");
//        int a = sc.nextInt();
//        System.out.print("2nd Subject: ");
//        int b = sc.nextInt();
//        System.out.print("3rd Subject: ");
//        int c = sc.nextInt();
//        
//        int avg = (a+b+c)/3;
//        
//         if ( avg >= 80) {
//             System.out.println("You are above standard!");
//             System.out.println("Admission granted!");
//         }
//         else {
//             System.out.println("You are not on the merit!");
//         }



// Q4. Write a program to input a number and determine whether it is positive, negative or 0.
//        System.out.println("Enter a number and determine whether it is positive, negative or 0.");
//        System.out.print("\nEnter the number: ");
//        int a = sc.nextInt();
//
//        if ( a > 0 ){
//            System.out.println("The Given Number Is Positive.");
//        }
//        else if ( a < 0 ){
//            System.out.println("The Given Number Is Negative.");
//        }
//        else {
//            System.out.println("The Given Number Is 0.");
//        }



// Q5. Write a program that inputs three numbers and displays the maximum number.
//        System.out.println("Enter three numbers to find the maximum number.");
//        System.out.print("1st Number: ");
//        int a = sc.nextInt();
//        System.out.print("2nd Number: ");
//        int b = sc.nextInt();
//        System.out.print("3rd Number: ");
//        int c = sc.nextInt();   
//
//        int max = a;
//        
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c; 
//        }
//        System.out.println("The maximum number is: " + max);

//orrrrr
//        if(a<b){
//        if(a<c){
//        System.out.println(a+ " is the smallest number.");
//        }
//        else{
//        System.out.println(c+ " is the smallest number."); 
//        }}
//        else{
//        if(b<c){
//        System.out.println(b+ " is the smallest number."); }
//        else{
//        System.out.println(c+ " is smallest number."); 
//        }}}}



// Q6. Write a program that inputs a number and finds whether it is even or add using if-else structure.
//        System.out.println("Enter a number and determine whether it is even or odd");
//        System.out.print("\nEnter the number: ");
//        int a = sc.nextInt();
//
//        if ( a%2 == 0 ){
//            System.out.println("The Given Number Is Even.");
//        }
//        else {
//            System.out.println("The Given Number Is Odd.");
//        }



// Q7. Write a program that inputs salary and grade. It adds 50% bonus if the grade is greater than 15. It adds 25% bonus if the grade 15 or less and then displays the total salary.
//        int salary, grade;
//        double bonus, totalSalary; 
//        System.out.println("Enter Your Grade To Findout Your Bonus!");
//        System.out.print("Enter Your Salary: ");
//        salary = sc.nextInt();
//        System.out.print("Your Grade: ");
//        grade = sc.nextInt();
//        
//        if (grade > 15)
//            bonus = salary * 0.50;
//        else 
//            bonus = salary * 0.25;
//        
//        totalSalary = salary + bonus;
//        System.out.println("Your Total Salary Is: " + (int)totalSalary);

        
        
// Q8. Write a program that inputs two integers. It determines and prints if the first integer is a multiple of second integer.
//        System.out.println("Enter two integers to check if the first integer is a multiple of second integer");
//        System.out.print("1st Integer: ");
//        int a = sc.nextInt();
//        System.out.print("2nd Integer: ");
//        int b = sc.nextInt();
//        
//        if ( a%b == 0) {
//            System.out.println(a + " is a multiple of " + b);
//        }
//        else {
//            System.out.println(a + " is not a multiple of " + b);
//        }
        
        

// Q9. Write a program that calculates electricity bill. The rates of electricity per unit are as follows. 
// If the units consumed are <= 300, then the cost is Rs.12 per unit. 
// If the units consumed are > 300 and <=500, then the cost is Rs.15 per unit. 
// If the units consumed exceed 500 then the cost per unit is Rs.17.
//A line rent Rs.1500 is also added to the total bill and a surcharge of 5% extra if the bill exceeds Rs.2000.
        int units,price_pu, lineRent;
        System.out.print("Enter Your Units To Check Your Electricity Bill: ");
        units = sc.nextInt();
        
        price_pu = 0;
        lineRent = 1500;
        
        if (units < 0 ) {
            System.out.println("Invalid Units!");
        }
        else if(units > 0 && units <= 300 ) {
            price_pu = units*12;
        }
        else if(units > 300 && units <= 500 ) {
            price_pu = 3600 + ((units-300)*15);
        }
        else {
            price_pu = 6600 + ((units-500)*17);
        }
        
        double total;
        
        if (price_pu > 2000 ) {
            total = lineRent + price_pu + (price_pu * 0.05);
            System.out.println("Your Bill Is " + (int)total + " including 1500 line rent and 5% surcharge!");
        } else {
            total = price_pu;
            System.out.println("Your Bill Is " + (int)total);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
