package Lecture04;

import java.util.Scanner;

public class EligibleTowork {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >=16 && age<65) {
            System.out.println("You are eligible to work");
        } else {
                System.out.println("You are not eligible to work");
            }
        }
    }
