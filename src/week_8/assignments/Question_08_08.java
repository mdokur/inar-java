package week_8.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        double[][] points = createMatrix();
        double minDistance = findMinDistance(points);
        display(minDistance, points);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] matrix = new double[numberOfPoints][2];

        System.out.print("Enter 8 points:");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = input.nextDouble();
            matrix[i][1] = input.nextDouble();
        }
        return matrix;
    }

    public static double findMinDistance(double[][] matrix) {
        double minDistance = distance(matrix[0][0], matrix[0][1],
                matrix[1][0], matrix[1][1]);

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double distance = distance(matrix[i][0], matrix[i][1],
                        matrix[j][0], matrix[j][1]);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }
    public static void display(double minDistance, double[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double distance = distance(matrix[i][0], matrix[i][1],
                        matrix[j][0], matrix[j][1]);
                if (distance == minDistance) {

                    System.out.println("The closest two points are " +
                            "(" + matrix[i][0] + ", " + matrix[i][1] + ") and (" +
                            matrix[j][0] + ", " + matrix[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + minDistance);
    }
}
