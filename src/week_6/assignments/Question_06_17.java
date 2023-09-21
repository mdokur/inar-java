package week_6.assignments;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int number = input.nextInt();

        printMatrix(number);
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int matrixNumber = (int) (Math.random() * 2);
                System.out.print(matrixNumber + "  ");
            }
            System.out.println();
        }
    }
}
