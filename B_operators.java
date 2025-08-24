package pf;

public class B_operators {
     public static void main(String[] args) {
//          arithmetic using integers..............................................................................................
         System.out.println("\n1: Integer Arithmetic (1st Type).................");
         int a,b,c,d,e;
         a = 1 + 1;
         b = a * 3;
         c = b / 4;
         d = c - a;
         e = -d;
         System.out.println("a = " + a);
         System.out.println("b = " + b);
         System.out.println("c = " + c);
         System.out.println("d = " + d);
         System.out.println("e = " + e);
         // arithmetic using doubles.............................................
         System.out.println("\n2: Floating Point Arithmetic");
         double da = 1 + 1;
         double db = da * 3;
         double dc = db / 4;
         double dd = dc - a;
         double de = -dd;
         System.out.println("da = " + da);
         System.out.println("db = " + db);
         System.out.println("dc = " + dc);
         System.out.println("dd = " + dd);
         System.out.println("de = " + de);
         //Arithmetic Compound Assignment Operators..............................
         System.out.println("\n3: Compound ass operator");
         int aa = 1;
         aa = aa + 4;
         int ab = 1 ;
         ab += 4;
         System.out.println("aa = " + aa);
         System.out.println("ab = " + ab); 
         //increament and decreamnet operator....................................
         System.out.println("\n4:Increament and Decreamnet operator");
         int ia,ib;
         ia = 1;
         ia++;
         ib = 1;
         --ib;
         System.out.println(ia); 
         System.out.println(ib); 
//          2nd try
         int at = 1;
         int bt = 2;
         System.out.println("a = " + at);
         int ct;
         int dt;
         ct = ++bt;
         dt = at++;
         ct++;
         System.out.println("a = " + at);
         System.out.println("b = " + bt);
         System.out.println("c = " + ct);
         System.out.println("d = " + dt);
         // Relational Operators.................................................................................................
         System.out.println("\n5: Relational operator (2nd Type)................");
         //== Equal to
         //!= Not equal to
         //> Greater than
         //< Less than
         //>= Greater than or equal to
         //<= Less than or equal to 
         String ra = "Lmao";
         if (ra.equals ("Lmao")) {
             System.out.println("Equal");
         }
         String rb = "Lmao";
         if (!rb.equals ("L")) {
             System.out.println("Not Equal");
         }
         int rc = 5;
         int rd = 6;
         if (rc != rd) {
             System.out.println("(5 < 6) ✔️😎");
         }
         // Logica Operators.................................................................................................
         System.out.println("\n6: Logical operator (3nd Type)....................");
         //                 & Logical AND
         //                 | Logical OR
         //                 ^ Logical XOR (exclusive OR)
         //                 || Short-circuit OR
         //                 && Short-circuit AND
         //                 ! Logical unary NOT
         //                 &= AND assignment
         //                 |= OR assignment
         //                 ^= XOR assignment
         //                 == Equal to
         //                 != Not equal to
         //                 ?: Ternary if-then-else
         boolean v1,v2,v3,v4,v5,v6,v7;
         v1 = true;
         v2 = false;
         v3 = v1 | v2;
         v4 = v1 & v2;
         v5 = v1 ^ v2;
         v6 = (!v1 & v2) | (v1 & !v2);
         v7 = !v1;
         System.out.println(" true | false = " + v3);
         System.out.println(" true & false = " + v4);
         System.out.println(" true ^ false = " + v5);
         System.out.println(" !true & false | true & !false = " + v6);
         System.out.println(" !true = " + v7);
         //The Compound Assignment Operator..............................................
         System.out.println("\n7: The Assignment Operator");
         int ao1,ao2, ao3;
         ao1 = ao2 = ao3 = 100;
         System.out.println("ao1 = ao2 = ao3 = "+ao1+" "+ao2+" "+ ao3);
         
     }
}

//for(int j=1; j<= 20; j++){
//          System.out.println(j+" Sarmad");
//     }