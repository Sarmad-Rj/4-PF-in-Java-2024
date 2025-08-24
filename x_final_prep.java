
package pf;
import java.util.Scanner;
public class x_final_prep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try { 
            int v = 30;
            if (v<40) {
                System.out.println("the value is too small");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Continue after the catch block!");
 
    }

}
