package Lecture04;

public class PrintQuadraticEquation {
    public static void main(String[] args) {
        double a = 7.2;
        double b = 5;
        double c = 9;

        // declared the two roots
        double root1;
        double root2;

        // determinant (b^2 - 4ac)
        double determinant = b * b - 4 * a * c;

        System.out.println("Determinant = " + determinant);

        //determinant > 0
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println("\nDeterminant > 0");
        System.out.println("root1 = " + root1);
        System.out.println("root2 = " + root2);


        //determinant == 0
        root1 = root2 = -b / (2 * a);
        System.out.println("\nDeterminant == 0");
        System.out.println("root1 = root2 = " + root1);

        //determinant < 0
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        System.out.println("\nDeterminant < 0");
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
}

