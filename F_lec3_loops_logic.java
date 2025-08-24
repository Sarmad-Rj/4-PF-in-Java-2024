
package pf;
import java.util.*;
enum wash {Linen, Cotton, Wool}
public class F_lec3_loops_logic {
     public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
//        System.out.print("Enter your marks");
//        int marks = input.nextInt();
        
        
//        if(marks>=90){
//        System.out.println("A grade");
//        System.out.println("Congratulations");
//     }
//        else if (marks>=80) {
//        System.out.println("B grade");           
//        }
//        else if (marks>=70) {
//        System.out.println("C grade");           
//        }
//        
//         else if (marks>=60) {
//        System.out.println("you failed");  
//         }
//        else if (marks>100 || marks<0){
//       System.out.println("invalid");
//        }
     
//        int score;
//        System.out.print("Enter your score: ");
//        score = input.nextInt();
//        if (score >= 90.0)
//        System.out.println("A");
//        else if (score >= 80.0)
//        System.out.println("B");
//        else if (score >= 70.0)
//        System.out.println("C");
//        else if (score >= 60.0)
//        System.out.println("D");
//        else
//        System.out.println("F");


//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//
//        if (number % 2 == 0 && number % 3 == 0) {
//            System.out.println(number + " is divisible by 2 and 3.");
//        }
//        if (number % 2 == 0 || number % 3 == 0) {
//            System.out.println(number + " is divisible by 2 or 3.");
//        }
//        if (number % 2 == 0 ^ number % 3 == 0) {
//            System.out.println(number + " is divisible by 2 or 3, but not both.");
//        }

            int wash;
            wash = 3;
            switch(wash) {
            case 1: // wash is 1 for Cotton
            System.out.println("Cotton selected");
            break;
            case 2: // wash is 2 for Linen
            System.out.println("Linen selected");
            break;
            case 3: // wash is 3 for Wool
            System.out.println("Wool selected");
            break;
            default: // Not a valid value for wash
            System.out.println("Selection error");
            break;
            }
     
     } 
}      
     