package week_5.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumOfNumber = 0;
        double powSumOfNumber = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 1; i <= 10; i++) {
            double number = input.nextDouble();
            sumOfNumber += number;
            powSumOfNumber += Math.pow(number, 2);
        }
        double mean = sumOfNumber / 10;
        double deviation = Math.sqrt((powSumOfNumber - (Math.pow(sumOfNumber, 2) / 10)) / 9);
        System.out.printf("The mean is %.2f\n The standard deviation is %f", mean, deviation);
    }
}
