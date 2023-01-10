package Lecture05;

public class SumMatrixDiagona {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 5, 6, 20},
                {1, 10, 20, 4},
                {11, 20, 10, 14},
                {20, 24, 25, 10}
        };
        int matrixSize = 4;

        int principalDiagonal = 0, secondaryDiagonal = 0;
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col)
                    principalDiagonal += matrix[row][col];
                if ((row + col) == (matrixSize - 1))
                    secondaryDiagonal += matrix[row][col];
            }
        }
        System.out.println(" The sum of principal diagonal is: " + principalDiagonal);
        System.out.println(" The sum of secondary diagonal is: " + secondaryDiagonal);
    }
    }


