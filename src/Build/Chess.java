package Build;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {

Scanner scanner  = new Scanner(System.in);
System.out.println("Enter the first value for the first field");
int x  = scanner.nextInt();
        System.out.println("Enter the second value for the  first field");
                int y  = scanner.nextInt();
        System.out.println("Enter the  firs value for the second field");
        int x1 = scanner.nextInt();
        System.out.println("Enter the  second value for the second field");
         int y1 = scanner.nextInt();

         int sum1 = x + y;
         int sum2 = x1 + y1;
         if(sum1 % 2 ==0 && sum2 % 2 != 0  ){
             System.out.println("The both fields are with the same color");

         }else{
             System.out.println("The both fields are with different color");

         }
           }
}