package pf;

import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class sis_natasha {
  public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
    int bill=scanner.nextInt();
    if(bill<=50){
      System.out.println("bill is"+(bill*0.50));
    } else if(bill>50 && bill<=100){
      System.out.println("bill is"+(bill*0.75));
      
    } else if(bill>100 && bill<=200){
      System.out.println("bill is"+(bill*1.20));
    } else if(bill>200){
      System.out.println("bill is"+(bill*1.50));
    }              
  }
    }
