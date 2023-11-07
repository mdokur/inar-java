package week_8.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        System.out.println("Enter the matrix1 (3x3);");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        double[][] matrix2 = new double[3][3];
        System.out.println("Enter the matrix2 (3x3):");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] resultMatrix = new double[3][3];
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf("%3.1f ", resultMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
