package week_9.assigments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the matrix: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        System.out.println("Enter the matrix:");
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(matrix);
        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + "," +
                location.column + ")");
    }
}
