package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        displayMatrix(matrix);

        int largestRow = largestRow(matrix);
        System.out.println("The largest row index: " + largestRow);

        int largestColumn = largestColumn(matrix);
        System.out.println("The largest column index: " + largestColumn);
    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("The random array is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int largestRow(int[][] matrix) {
        ArrayList<Integer> maxRowArr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int totalRow = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    totalRow++;
                }
            }
            maxRowArr.add(i, totalRow);
        }
        int maxRowValue = maxRowArr.get(0);
        int maxRowNumber = 0;
        for (int i = 0; i < maxRowArr.size(); i++) {
            if (maxRowArr.get(i) > maxRowValue) {
                maxRowValue = maxRowArr.get(i);
                maxRowNumber = i;
            }
        }
        return maxRowNumber;
    }

    public static int largestColumn(int[][] matrix) {
        ArrayList<Integer> maxColumnArr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int totalRow = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] == 1) {
                    totalRow++;
                }
            }
            maxColumnArr.add(i, totalRow);
        }
        int maxColumnValue = maxColumnArr.get(0);
        int maxColumnNumber = 0;
        for (int i = 0; i < maxColumnArr.size(); i++) {
            if (maxColumnArr.get(i) > maxColumnValue) {
                maxColumnValue = maxColumnArr.get(i);
                maxColumnNumber = i;
            }
        }
        return maxColumnNumber;
    }
}
