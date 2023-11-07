package week_8.assignments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = createMatrix();
        double[][] matrix2 = createMatrix();
        double[][] multiplyMatrix = multiplyMatrix(matrix1, matrix2);
        displayMatrix(multiplyMatrix);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = ((matrix1[i][1] * matrix2[1][j]) +
                        (matrix1[i][2] * matrix2[2][j]) +
                        (matrix1[i][3] * matrix2[3][j]));
            }
        }
        return result;
    }

    public static void displayMatrix(double[][] matrix) {
        System.out.println("The multiplication od the matrices is:");
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%2.2f ", doubles[j]);
            }
            System.out.println();
        }
    }
}
