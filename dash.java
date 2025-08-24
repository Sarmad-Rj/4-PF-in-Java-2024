
package pf;

public class dash {
           public static void main(String[] args) {
//               int i = 5;
//               
//               System.out.println(i);    // 5
//               System.out.println(i++);  // 5
//               System.out.println(++i);  // 7

            int a,c,b,d;
            a = 2;
            b = 3;
            c = 5;
//          b += a;
        //  b = b + a = 3 + 2 = 5
//          System.out.println(b);  // 5
            
//            b += a*c;
         // b = b + (a*c)
         // b = 3 + 10
         // b = 13
//            System.out.println(b);  // 13
//            a+=2; b= 2/2;
//            System.out.println(a);
//            System.out.println(b);
            
            double x = 1234.567891; // 1234.567891
            long y = (long) x;      // 1234
            double z = (x - y) ;    // 12345.567891 - 1234 = 0.567891
            double z1 = z*10000;    // 0.567891 * 10000    = 5678.91
            short z2 = (short) z1;  // 5678
            
            System.out.println(x);  // 1234.567891
            System.out.println(y);  // 1234
            System.out.println(z2); // 5678
            System.out.println(y + "." + z2); // 1234.5678  
            
            float e;
            a = -465;
            b = 13;
            e = 15.5f % 10.5f;
            System.out.println("e="+e); 
            
           // 9.0 Compiler ✔️
           // 9.255 SARMAD ✔️
           // 9.657 KITTY ❌
           // 9.85 AI ✔️
           // 8.75 Ikram 
           // 9.681 Haris
            

            

               
           }
}

//public class Example {
//    public static void main(String[] args) {
//        int number = 5;
//        checkNumber(number);
//    }
//
//    public static void checkNumber(int num) {
//        if (num < 0) {
//            System.out.println("Number is negative. Exiting method.");
//            return; // Exit the method if the number is negative
//        }
//
//        // Continue with the rest of the method if the number is not negative
//        System.out.println("Number is positive or zero.");
//    }
//}