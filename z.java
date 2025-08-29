
package pf;
import java.util.Scanner;

public class z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int count = 0;
         System.out.println("Enter ages (enter -1 to stop!):");
         int age;
         while ((age = scanner.nextInt()) != -1) {
             if (age >= 50 && age <= 60) {
                count++;
             }
         }
         System.out.println("Number of persons in the age group 50-60: " + count);
 



    }

}
