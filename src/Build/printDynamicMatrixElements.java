package Build;

import java.util.Arrays;
import java.util.Scanner;

public class printDynamicMatrixElements {
    public static void main (String[]args){
       Scanner scanner= new Scanner(System.in) ;
       System.out.println("Pls enter the number of rows");
       int rows= scanner.nextInt();
        System.out.println("Pls enter the number of columns");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int row= 0;row<rows;row++){
            for(int col=0; col<cols;col++){
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix[row][col] = scanner.nextInt();
                System.out.println("The matrix is created: " + Arrays.deepToString(matrix));
            }
            }
        }

    }

