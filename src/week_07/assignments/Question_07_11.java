package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double mean = getMean(numbers);
        double standardDeviation = getStandardDeviation(numbers, mean);

        System.out.printf(" The mean is %.2f\n " +
                "The standard deviation is %.4f", mean, standardDeviation);
    }

    public static double getMean(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum / 10;
    }


    private static double getStandardDeviation(double[] array, double mean) {
        double standardDeviation = 0;
        double seriesSum = 0;
        for (double number : array) {
            seriesSum += Math.pow(number - mean, 2);
        }
        standardDeviation = Math.sqrt(seriesSum / array.length - 1);

        return standardDeviation;
    }
}
