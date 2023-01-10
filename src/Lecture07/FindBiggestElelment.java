package Lecture07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class FindBiggestElelment {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 40};

        int biggestNum = numbers[0];

        // Traverse array elements from second and compare every element with current biggest number
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > biggestNum)
                biggestNum = numbers[i];

        System.out.println("The biggest number is: " + biggestNum);
    }

    }