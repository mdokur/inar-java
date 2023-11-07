package week_8.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        int columnNumber = 0;
        sumOfColumn(matrix, columnNumber);
        displaySumOfColumn(matrix);
    }

    public static void displaySumOfColumn(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++)
            System.out.printf("Sum of the elements at column %d is %s%n", i, sumOfColumn(matrix, i));
    }

    public static double sumOfColumn(double[][] matrix, int columnNumber) {
        double sum = 0;
        for (int j = 0; j < matrix.length; j++) {
            sum += matrix[j][columnNumber];
        }
        return sum;
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4  matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
