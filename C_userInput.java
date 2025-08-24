package pf;
import java.util.*;

public class C_userInput {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("To Multiply");
    System.out.println("Enter the first value: ");
    int x = input.nextInt();
    System.out.println("Enter the first value: ");
    int y = input.nextInt();
    int z = x * y;
    System.out.println("Your answer is: " + z);
    }
}
