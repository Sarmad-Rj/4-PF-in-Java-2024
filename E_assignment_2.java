
package pf;
import java.util.Scanner;
public class E_assignment_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      Question No: 1 ./././././././././././././././././././././././././././././11111
//        System.out.println("Q1: Write a program that inputs dividend and divisor. It then calculates and displays the quotient and remainder.");
//        int dividend,divisor,quotient,remainder;
//        System.out.print("Enter the dividend: ");
//        dividend = sc.nextInt();
//        System.out.print("Enter the divisor: ");
//        divisor = sc.nextInt();
//        quotient = dividend / divisor;
//        remainder = dividend % divisor;
//        System.out.println("Quotient = " + quotient);
//        System.out.println("Remainder = " + remainder);
        
        
        
//      Question No: 2 ./././././././././././././././././././././././././././././22222
//        System.out.println("Q2: Write a program that inputs two numbers, swaps the values and then displays them. ");
//        int a,b,c;
//        System.out.println("\nSo enter the numbers");
//        System.out.print("Enter Value of A: ");
//        a = sc.nextInt();
//        System.out.print("Enter Value of B: ");
//        b = sc.nextInt();
//        c = a;
//        a = b;
//        b = c;    
//        System.out.println("\t👉👉👉  A: " + a + ", B: " + b + "   👈👈👈");



//      Question No: 3 ./././././././././././././././././././././././././././././33333
//        System.out.println("Q3: Write a program that inputs two numbers, swap these values without using the third variable and display them.");
//        int a,b;
//        System.out.println("\nSo enter the numbers");
//        System.out.print("Enter Value of A: ");
//        a = sc.nextInt();
//        System.out.print("Enter Value of B: ");
//        b = sc.nextInt();
//        // a = a+b;
//        // b = a-b;
//        // a = a-b;
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println("\t👉👉👉  A: " + a + ", B: " + b + "   👈👈👈");



//      Question No: 4 ./././././././././././././././././././././././././././././44444
        System.out.println("Q4: Write a program that inputs a five digit number as input and reverse the number. For example if the user enters 12345, it displays 54321.");
        int number;
        System.out.print("\nEnter a five-digit number to reverse it");
        System.out.print("The number: ");
        number = sc.nextInt();
        
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
            return;
        }

        int reversedNumber = 0;
        reversedNumber += (number % 10) * 10000; // if number = 12345
                       //  (12345 % 10) * 10000
                       //  (5) * 10000
                       //  50000
        number /= 10; 
        // 12345 = 1234.5 = 1234 
        reversedNumber += (number % 10) * 1000; 
                       // (1234 % 10) * 1000
                       // 4 * 1000
                       // 4000
        // 50000 + 4000
        // 54000
        number /= 10;
        // 1234 = 123.4 = 123         
        reversedNumber += (number % 10) * 100;  
                       // (123 % 10) * 100
                       // 3 * 100
                       // 300
        // 54000 + 300
        // 54300
        number /= 10;
        // 123 = 12.3 = 12
        reversedNumber += (number % 10) * 10;  
                       // (12 % 10) * 10
                       // 2 * 10
                       // 20
        // 54300 + 20 
        // 54320
        number /= 10;
        // 12 = 1.2 = 1
        reversedNumber += number;                
        // 54320 + 1
        // 54321

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);



//      Question No: 5 ./././././././././././././././././././././././././././././55555
//        System.out.println("Q5: Write a program that inputs an even and odd number through keyboard, multiplies even with 5 and odd with 3 and adds both results. It subtracts the result from 1000 and finally prints the difference.");
//        int a,b,c,d;
//        System.out.println("\nSo enter the numbers");
//        System.out.print("Enter Even Number: ");
//        a = sc.nextInt();
//        System.out.print("Enter Odd Number: ");
//        b = sc.nextInt();
//        if (a%2==0 && b%2==1) {
//             a *= 5;
//             b *= 3;
//             c = a+b;
//             d = c-1000;
//             System.out.println("\t👉👉👉  Even Value: " + a + ", Odd Value: " + b + ", After adding both: " + c + ", Subtract from 1000: " + d + "   👈👈👈");
//        }
//        else {
//            System.out.println("Please enter a valid numbers!");        
//        }
        



//      Question No: 6 ./././././././././././././././././././././././././././././66666
//        System.out.println("Q6: Write a program that will prompt the user to enter the number of hours. It computes and displays the number of weeks and days.");
//        System.out.println("\nSo Enter Number of Hours:                (Note: Hours must be 24+)");
//        int hours = sc.nextInt();    
//        int days = hours / 24;
//        int weeks = days / 7;    
//        if (hours >= 24) {
//            System.out.println("In " + hours + " hours, The days will be: " + days);
//            System.out.println("In " + hours + " hours, The Week will be: " + weeks);
//        }
//        else {
//            System.out.println("Please Enter valid hours!");
//        }
    
        

//      Question No: 7 ./././././././././././././././././././././././././././././77777
//        System.out.println("Q7: Write a program that inputs miles from the user and convert miles into kilometers.");
//        double miles, Kms;
//        System.out.print("\nEnter A Value of Mile to convert into Kilometers: ");
//        miles = sc.nextDouble();
//        Kms = miles * 1.60934 ;
//        System.out.println(miles + " miles are " + Kms + " Kms");
        

        
//      Question No: 8 ./././././././././././././././././././././././././././././88888
//        System.out.println("Q8: Write a program that inputs 4 numbers and calculates the sum, average and product of all numbers");
//        int a,b,c,d,sum, avg, product;
//        System.out.print("\nEnter The First Number:  ");
//        a = sc.nextInt();
//        System.out.print("Enter The Second Number: ");
//        b = sc.nextInt();
//        System.out.print("Enter The Third Number:  ");
//        c = sc.nextInt();
//        System.out.print("Enter The Fourth Number: ");
//        d = sc.nextInt();
//        sum = a+b+c+d;
//        avg = sum / 4;
//        product = a*b*c*d;
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + avg);
//        System.out.println("Product: " + product);



//      Question No: 9 ./././././././././././././././././././././././././././././....99999
//        System.out.println("Q9: Write a program that inputs age in years and displays age and in days and months.");
//        int a,b,c,d,age, days, months;
//        System.out.print("\nEnter Your Age(In years): ");
//        age = sc.nextInt();
//        days = age * 365;
//        months = age * 12;
//        System.out.println("A " + age + " y/o boy is '" + months + "' Months Old." );
//        System.out.println("And A  " + age + " y/o boy is '" + days + "' Days Old." );
        
        
        
//      Question No: 10 ././././././././././././././././././././././././././././....10
//        System.out.println("Q10: A car can travel 5.3 miles in 1 liter. Write a program that inputs petrol in liters and displays how much distance The car can cover using the available petrol.");
//        float liter, distance;
//        System.out.println("\n1 liter travels 5.3 miles.");
//        System.out.print("Enter the amount of fuel(In liters): ");
//        liter = sc.nextFloat();
//        distance = liter * 5.3f;
//        
//        System.out.println("\nDistance coverd by the car with '" + liter + "' liter fuel is: " + distance + " miles");
        
        
        
//      Question No: 11 ././././././././././././././././././././././././././././....11
//        System.out.println("Q11: Write a program that inputs the total number of students in a class and fee per student. It displays the total fee collected from the class.");
//        int students, fee, total;
//        System.out.println("\nEnter the number of students and their fee to count total fee.");
//        System.out.print("Students: ");
//        students = sc.nextInt();
//        System.out.print("Fee: ");
//        fee = sc.nextInt();
//        total = students * fee;
//        
//        System.out.println("The total fee is: " + total);
     


//      Question No: 12 ././././././././././././././././././././././././././././....12
//        System.out.println("Q12: Write a program that inputs temperature from the user in Farenheit and converts it into Celsius degree.");
//        float f,c;
//        System.out.println("\nFarenheit To Celsius Converter");
//        System.out.print("Value in farenheit: ");
//        f = sc.nextFloat();
//        c = ((f-32) * 5 ) / 9;
//        System.out.println("The " + (int)f + "℉ is equals to '" + c + "℃'" );
        
        
        
//      Question No: 13 ././././././././././././././././././././././././././././....13
//        System.out.println("Q13: Write a program that inputs five-digit through the keyboard and calculates the sum of its digits.");
//        int number, sum ;
//        System.out.print("\nEnter Five-Digits Number: ");
//        number = sc.nextInt();
//        if (number < 10000 || number > 99999) {
//            System.out.println("Please enter a valid five-digit number.");
//            return;
//        }
//
//        sum = 0;
//
//        sum += number % 10; 
//        // 0 += 54321 % 10 
//        // 0 += 1
//        // 1 
//        number /= 10;
//        //54321 / 10
//        //5432.1
//        //5432
//        sum += number % 10;
//        // 1 += 5432 % 10 
//        // 1 += 2
//        // 3 
//        number /= 10;
//        //5432 / 10
//        //543.2
//        //543
//        sum += number % 10;
//        // 3 += 543 % 10 
//        // 3 += 3
//        // 6 
//        number /= 10;
//        //543 / 10
//        //54.3
//        //54
//        sum += number % 10;
//        // 6 += 54 % 10 
//        // 6 += 4
//        // 10 
//        number /= 10;
//        // 54 / 10
//        // 5.4
//        // 5
//        sum += number;
//        // 10 + 5
//        // 15
//
//        System.out.println("Sum of the digits: " + sum);
        



//      Question No: 14 ././././././././././././././././././././././././././././....14
//        System.out.println("Q14: Write a program that inputs marks obtained by a student in five subjects. It then calculates and displays the total marks and percentage.");
//        double a,b,c,d,e,total,sum, percentage;
//        System.out.println("\nA Program To Check Your Marks Percentage.");
//        System.out.print("Subjecct 1: ");
//        a = sc.nextInt();
//        System.out.print("Subjecct 2: ");
//        b = sc.nextInt();
//        System.out.print("Subjecct 3: ");
//        c = sc.nextInt();
//        System.out.print("Subjecct 4: ");
//        d = sc.nextInt();
//        System.out.print("Subjecct 5: ");
//        e = sc.nextInt();
//        System.out.print("Total: ");
//        total = sc.nextInt();
//        sum = a+b+c+d+e;
//        percentage = (sum / total) * 100 ;
//        System.out.println("Your total marks are: " + (int) sum);
//        System.out.println("You got " + (int) percentage + "% marks");
    }
}
