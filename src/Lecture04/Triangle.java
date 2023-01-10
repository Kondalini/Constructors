package Lecture04;

import java.util.Scanner;

public class Triangle {

        public static void main(String[] args) {




                Scanner myObj = new Scanner(System.in);

                System.out.println("Enter a size of angle");
                int a = myObj.nextInt();

                System.out.println("Enter a size of angle");
                int b = myObj.nextInt();

                System.out.println("Enter a size of angle");
                int c = myObj.nextInt();
                int sum = a + b + c;

                if (sum <= 180){
                    System.out.println("The triangle can be built");
                }
                else if(a == 90) {
                    System.out.println("The triangle is right-angle");
                }
                else if(a>90){
                    System.out.println("The triangle obtuse");
                }
                else {
                    System.out.println("The triangle acute");
                }
            }





        }






