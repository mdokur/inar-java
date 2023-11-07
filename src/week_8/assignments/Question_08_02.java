package week_8.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        displaySumMajorDiagonal(matrix);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void displaySumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }
}
