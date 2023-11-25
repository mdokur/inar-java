package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten values of double type: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The average value: " + getAverageOfArray(numbers));
    }

    public static double getAverageOfArray(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum / 10;
    }
}
