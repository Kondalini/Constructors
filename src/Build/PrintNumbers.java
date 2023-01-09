package Build;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();


        int min = x;
        int max = y;
        if(x>y) {
            min = y;
            max = x;
        }
          for(int i = min; i<= max;i++){
              System.out.println( i + " ");
          }
        }


    }

