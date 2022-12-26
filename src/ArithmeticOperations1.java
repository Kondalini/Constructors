import java.util.Scanner;

public class ArithmeticOperations1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pls enter first triangle side");
        int a = myObj.nextInt();
        System.out.println("Pls enter second triangle side");
        int b = myObj.nextInt();
        System.out.println("Pls enter second triangle side");
        int c = myObj.nextInt();
      int perimeter  = a+b+ c;
        System.out.println("The triangle perimeter is :" + perimeter);



    }
}