/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class assignment_11 {
    
        public static void main(String[] args) {

    // Question No 8.......................................................................................................
        System.out.println("\nQuestion No 8........................................8");
        
        int a, b, c;
        a = 2;
        b = 3;
        c = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c);

        // 1. ++a
        System.out.println("1: ");
        ++a;
        System.out.println("\tAfter ++a: a = " + a);

        //2 
        System.out.println("2: ");
        System.out.println("\tabc; Invalid (syntax error, unclear operation)");
        
        // 3. a++
        a = 2; // reset the value
        a++;
        System.out.println("3: ");
        System.out.println("\tAfter a++: a = " + a);

        // 4. b += a
        a = 2; // reset the value
        b += a;
        System.out.println("4: ");
        System.out.println("\tAfter b += a: a = " + ", b = " + b);

        // 5. b += a * c
        a = 2;
        b = 3;
        b += a * c;
        System.out.println("5: ");
        System.out.println("\tAfter b += a * c: a = " + ", b = " + b );
        
        //6 
        System.out.println("6: ");
        System.out.println("\ta++b; Invalid (syntax error, unclear operation)");

        // 7. a += 2; b = 2/2
        a = 2;
        a += 2;
        b = 2 / 2;
        System.out.println("7: ");
        System.out.println("\tAfter a += 2 and b = 2/2: a = " + a + ", b = " + b);
        
        //8
        System.out.println("8: ");
        System.out.println("\t++b++; Invalid (syntax error, cannot increment twice in one statement)");

        // 9. b = a++ + b++
        a = 2;
        b = 3;
        b = a++ + b++;
        System.out.println("9: ");
        System.out.println("\tAfter b = a++ + b++: a = " + a + ", b = " + b);
 
        
        }
}
