package week_7.assignments;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        double minimumNumber = getMinimumNumber(numbers);
        System.out.println("The minimum number is: " + minimumNumber);
    }

    public static double getMinimumNumber(double[] array) {
        double minimumNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumNumber) {
                minimumNumber = array[i];
            }
        }
        return minimumNumber;
    }
}
