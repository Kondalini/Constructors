package Build;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;



public class PrintMatrixElements {
    public static void main (String[]args){



            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12}
            };

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    System.out.println( matrix[row][col]);
                }
            }
        }
    }

