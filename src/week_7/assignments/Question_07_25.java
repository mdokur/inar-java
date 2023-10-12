package week_7.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[3];
        System.out.println("Enter a, b, c:");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        solveAndDisplayQuadratic(number);
    }

    public static void solveAndDisplayQuadratic(int[] arr) {
        double discriminant = (Math.pow(arr[1], 2)) - (4 * arr[0] * arr[2]);
        double root1;
        double root2;

        if (discriminant > 0) {
            root1 = (((-1) * arr[1]) + (Math.pow(discriminant, 0.5))) / (2 * arr[0]);
            root2 = (((-1) * arr[1]) - (Math.pow(discriminant, 0.5))) / (2 * arr[0]);
            System.out.println("The number of real roots: 2");
            System.out.println("The equation has two roots " +
                    (float) root1 + " and " + (float) root2);
        } else if (discriminant == 0) {
            root1 = (((-1) * arr[1]) + (Math.pow(discriminant, 0.5))) / (2 * arr[0]);
            System.out.println("The number of real roots: 1");
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
