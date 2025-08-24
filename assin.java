
package pf;
enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
public class assin {
        public static void main(String[] args) {
            int a,b,c,d,e;
        // Question No 1.......................................................................................................
        System.out.println("Question No 1........................................1");
        a = 5;
        System.out.println("1: Postfix Decrement Operator (a--):");
        System.out.println("\tInitial value of a: " + a);
        System.out.println("\tValue of a--: " + (a--));  // prints 5
        System.out.println("\tValue of a after a--: " + a);  // prints 4

        a = 5;  // reset a

        // Prefix decrement operator
        System.out.println("2: Prefix Decrement Operator (--a):");
        System.out.println("\tInitial value of a: " + a);
        System.out.println("\tValue of --a: " + (--a));  // prints 4
        System.out.println("\tValue of b after --a: " + a);  // prints 4
        // Question No 2.......................................................................................................
        System.out.println("\nQuestion No 2........................................2");
        b = 5;

        // Postfix decrement operator in a larger expression
        c = b-- + 5;
        System.out.println("Postfix Decrement Operator (b--):");
        System.out.println("\tValue of c: " + c); 
        System.out.println("\tValue of b: " + b);

        b = 5;  // reset b

        // Prefix decrement operator in a larger expression
        c = --b + 3;
        System.out.println("Prefix Decrement Operator (--b):");
        System.out.println("\tValue of b: " + b);  // prints 4
        System.out.println("\tValue of c: " + c);  // prints 7 (4 + 3)

        // Question No 3.......................................................................................................
        System.out.println("\nQuestion No 3........................................3");
        a = 10;
        b = 20;
        c = 15;
        d = 8;
        e = 40; // not used in the expression

        // Evaluate the expression
        int result = a*b / (-c * 31 % 13) * d;
                 //=       -15 * 31 = -465
                 //=       -465 % 13
                 //=       -10
                 //= 200 / (-10) * 8
                 //= -20 * 8
                 //= -160

        System.out.println("Expression: a*b/(-c*31%13) * d");
        System.out.println("\tValues: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e);
        System.out.println("\tsolving by precedence order (),*,/,%,+,-");
        System.out.println("\tStep 1:" + " -c*31%13 = " + (-c * 31 % 13) );
        System.out.println("\tStep 2:" + " a*b = " + a * b);
        System.out.println("\tStep 3:" + " a*b(200)/-10 = " + 200/-10);
        System.out.println("\tStep 4:" + " -20*d(8) = " + -20 * 8);
        System.out.println("\tResult= " + result);


         // Question No 4.......................................................................................................
        System.out.println("\nQuestion No 4........................................4");
        
        float f1 = 20.90f;
        float f2 = 5.15f;
        System.out.println("f1 = 20.90 , f2 = 5.15");
        // Division
        float quotientFloat = f1 / f2;
        int quotientInt = (int) quotientFloat;
        System.out.println("\tx = f1 / f2");        
        System.out.println("\tFloat Quotient x: " + quotientFloat);
        System.out.println("\tInteger Quotient x: " + quotientInt);

        // Remainder
        float remainderFloat = f1 % f2;
        int remainderInt = (int) remainderFloat;
        System.out.println("\tx = f1 % f2");        
        System.out.println("\tFloat Remainder: " + remainderFloat);
        System.out.println("\tInteger Remainder: " + remainderInt);
        
         // Question No 5.......................................................................................................
        System.out.println("\nQuestion No 5........................................5");
        // Accessing enum values
        System.out.println("Months of the year: (using enum)");
        Month ma = Month.JANUARY;
        Month mb = Month.FEBRUARY;
        Month mc = Month.MARCH;
        Month md = Month.APRIL;
        Month me = Month.MAY;
        Month mf = Month.JUNE;
        Month mg = Month.JULY;
        Month mh = Month.AUGUST;
        Month mi = Month.SEPTEMBER;
        Month mj = Month.OCTOBER;
        Month mk = Month.NOVEMBER;
        Month ml = Month.DECEMBER;
                                         
        System.out.println("\t1: " + ma);
        System.out.println("\t2: " + mb);
        System.out.println("\t3: " + mc);
        System.out.println("\t4: " + md);
        System.out.println("\t5: " + me);
        System.out.println("\t6: " + mf);
        System.out.println("\t7: " + mg);
        System.out.println("\t8: " + mh);
        System.out.println("\t9: " + mi);
        System.out.println("\t10: " + mj);
        System.out.println("\t11: " + mk);
        System.out.println("\t12: " + ml);

         // Question No 6.......................................................................................................
        System.out.println("\nQuestion No 6........................................6");
        //Part 1
        System.out.println("Part a: ");
        int x = 20, y = 35;
        System.out.println("\tx: " + x);
        System.out.println("\ty: " + y);
        x = y++ + x++;
        System.out.println("\tx = y++ + x++;");
        System.out.println("\tx: " +x);
        y = ++y + ++x; 
        System.out.println("\ty = ++y + ++x;");
        System.out.println("\ty: " + y);
        
        //Part 2
        System.out.println("Part b: ");
        x = 10;
        y = 15;
        System.out.println("\tx: " + x);
        System.out.println("\ty: " + y);
        x = x++;
        y = ++y; 
        System.out.println("\tx = x++;");
        System.out.println("\ty = ++y;");
        System.out.println("\tx" + "," + "y");
        System.out.println("\t" + x + "," + y);

        //Part 3
        System.out.println("Part c: ");
        int i ,j,k,n;
        i = 5;
        j = 6;
        k = 7;
        n = 3;
        System.out.println("\t i=5, j=6, k=7, n=3");
        System.out.println("\t(i + j * k - k % n) = " + (i + j * k - k % n));
                                                     //  5 + 42 - 7 % 3
                                                     //  5 + 42 - 1
                                                     //  47 - 1
                                                     //  46
        System.out.println("\t(i / r) = " + (i / n));

        //Part 4
        System.out.println("Part d: ");  
        i = 5 ;
        System.out.println("\ti = " + i);  // 5
        System.out.println("\ti++ = " + (i++)); // 5
        System.out.println("\t++i = " + (++i)); // 7

         // Question No 7.......................................................................................................
        System.out.println("\nQuestion No 7........................................7");   
        System.out.println("a= 10, b=20, c=30, d= 40, e=50");         
        //Part 1
        System.out.println("Part a: "); 
        a = 10;
        b = 20;
        c = 30; 
        d = 40;
        e = 50;
        double resultA = (double) (a + b / (c - 5)) / ((d + 7) / (double) (e - 37) % 3); //16.25
        System.out.println("\t(a+b/(c-5)) / ((d+7) / (e-37) % 3)");  
                         //( 10 + 20 / ( 30-5 ) ) / ( (40 + 7) / (50-37) % 3 )
                         //( 10 + 20 / ( 25 ) ) / ( 47 / 13 % 3 )
                         //( 10.8 ) / ( 0.16529999999999978 )
                         // 65.33575317604365
        System.out.println("\tResult A: " + resultA);
        
        //Part 2
        System.out.println("Part b: ");  
            double resultB = a + b / c - 5 / d + 7 / e - 37 % 3; // huj9.0
        System.out.println("\ta + b / c - 5 / d + 7 / e - 37 % 3");
                          // 10 + 20 / 30 - 5 / 40 + 7 / 50 - 37 % 3
                          // 10 + 0.66 - 0.125 + 0.14 - 1
                          // 10.8 - 0.125 - 1
                          // 9.675 Kitty
                          
        System.out.println("\tResult B: " + resultB);

        //Part 3
        System.out.println("Part c: ");  
        int resultC = a * (b * b) - (c * b) + d;
                    //10 * (20*20) - (30*20) + 40
                    //10 * 400 - 600 + 40
                    //4000 - 600 + 40
                    //4000 - 560
                    //3440
        System.out.println("\ta * (b * b) - (c * b) + d");     
        System.out.println("\tResult C: " + resultC);

        // Question No 8.......................................................................................................
        System.out.println("\nQuestion No 8........................................8");
        
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
        
        // Question No 9.......................................................................................................
        System.out.println("\nQuestion No 9........................................9");
        
        // Declare and initialize a double variable
        double decimalValue = 1234.5566778899;

        // Retrieve the integral part (long)
        long integralPart = (long) decimalValue;
        
        // Retrieve the fractional part
        double fractionalPart = decimalValue - integralPart;
        
        // Extract the first four digits of the fractional part (short)
        short fractionalDigits = (short) (fractionalPart * 10000);
//        double fractionalDigit = ((fractionalPart * 10000) % 10000);
        // Display the results
        System.out.println("\tOriginal Double Value: " + decimalValue);
        System.out.println("\tIntegral Part (long): " + integralPart);
        System.out.println("\tFractional Part Digits (short): " + fractionalDigits);
        
        // Reconstruct the original value from integral and fractional parts
        System.out.println("\tReconstructed Value: " + integralPart + "." + String.format("%04d", fractionalDigits));
        System.out.println("\tReconstructed Value: " + integralPart + "." + fractionalDigits);
//        System.out.println(fractionalDigit);



        
        }    
}
