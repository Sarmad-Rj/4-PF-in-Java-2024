
package pf;

public class I_arrays {
    
    public static void main(String[] args) {
        // array...............................................................
        System.out.println("Array");
        int nums[] = {5,15,20,25};
        // how to print 
        System.out.println(nums[1]); // 15
        // how to update the value
        nums[1] = 5;
        System.out.println(nums[1]);
        
        // Dynamic array with limits...........................................
        System.out.println("Dynamic array");
        int s = 4;
        int num[] = new int[s]; 
        num[0] = 5;
        num[1] = 15;
        num[2] = 20;
        num[3] = 25;
        
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        
        // or
        
        for (int i = 0; i<=3; i++){
            System.out.println(num[i]);
        }
        // MultiDymentional array / 2D array...................................
        System.out.println("2D Array");
        int dd[][] = new int[2][3];
        
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                dd[i][j] = (int)(Math.random() * 10);
            }
            
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(dd[i][j] + " ");
            }
            System.out.println();
        }
        //....................................................................

        
    }
}
