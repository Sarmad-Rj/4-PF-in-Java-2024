
package pf;
import java.util.Scanner;

    
public class z_labfinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("enter age: ");
        int age;
        int count = 0;
        while ((age = sc.nextInt()) != -1){
            if (age >= 50 && age <= 60){
                count++;
            }
        }
        System.out.println("ppl " + count);       
        
    }
}




















    // Q C....................................................................C
//    public class z_labfinal {
//        public static int power(int x, int n) {
//            if (n <= 0) {
//            return 1;
//            } else if (n == 1) {
//            return x; 
//            } else {
//            return x * power(x, n - 1); 
//            }
//        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter integer a: ");
//            int a = sc.nextInt();
//            System.out.print("Enter integer b: ");
//            int b = sc.nextInt();
//            int result = power(a, b);
//            System.out.println(a + " ^ " + b + " = " + result);
//            }
//    }

    //Q B.....................................................................B
    
//    public class z_labfinal {
//    public static void line() {
//    for (int i = 1; i <= 10; i++) {
//        System.out.print("*");
//    }   
//        System.out.println();
//    }
//    public static void line(int n) {
//    for (int i = 1; i <= n; i++) {
//        System.out.print("*");
//    }
//        System.out.println();
//    }
//    
//    public static void line(int n, char c) {
//    for (int i = 1; i <= n; i++) {
//        System.out.print(c);
//    }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        line();
//        line(3); 
//        line(5, '@'); 
//    }
//    }
    
    //Q A.....................................................................A
//    public class z_labfinal {
//    public static int countDigits(int number) {
//        int count = 0;
//        number = Math.abs(number); 
//        while (number > 0) {
//        count++;
//            number /= 10; 
//        }
//        return count == 0 ? 1 : count; 
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int inputNumber = sc.nextInt();
//        int digitCount = countDigits(inputNumber);
//        System.out.println("The number of digits in " + inputNumber + " is: " + digitCount);
//    }
//    }
    
    //Q D.....................................................................d

//          public class z_labfinal {
//         public static void main(String[] args) {
//         int[] numbers = new int[5];
//         int[] squares = new int[5];
//         int[] cubes = new int[5];
//         int[] sums = new int[5];
//         
//         for (int i = 0; i < numbers.length; i++) {
//         numbers[i] = i + 1; 
//         squares[i] = i * i;
//         cubes[i] = i * i * i;
//         sums[i] = numbers[i] + squares[i] + cubes[i];
//         }
//         
//         System.out.println("Numbers: ");
//         displayArray(numbers);
//         System.out.println("Squares: ");
//         displayArray(squares);
//         System.out.println("Cubes: ");
//         displayArray(cubes);
//         System.out.println("Sums: ");
//         displayArray(sums);
//        
//         int totalSums = 0;
//         for (int i = 0; i < sums.length; i++) {
//            totalSums += sums[i];
//         }
//         System.out.println("Total of sums: " + totalSums);
//         }
//         
//         private static void displayArray(int[] arr) {
//         for (int num : arr) {
//         System.out.print(num + " ");
//         }
//         System.out.println();
//         }
//    }
    
    
    //Q E.....................................................................e
//public class z_labfinal {
//    public static void main(String[] args) {
//        int[][] array = {
//            {10, 20, 30, 40},
//            {50, 60, 70, 80}
//        };
//
//        int min = array[0][0];
//        int max = array[0][0];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                }
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//
//        System.out.println("Array:");
//        for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Minimum value: " + min);
//        System.out.println("Maximum value: " + max);
//    }
//}


    //Q F.....................................................................f
//    public class z_labfinal {
//        public static void main(String[] args) {
//        int x, y;
//        x = 50;
//        y = 0;
//
//        try {
//            int z = x / y;
//        } catch (ArithmeticException ex) {
//            System.out.println("Exception is: " + ex);
//        }
//
//        System.out.println("Sarmad");
//    }
//}

