package week_5.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();
        System.out.println("Enter the maturity period (number of months): ");
        int numberOfMonths = input.nextInt();
        System.out.println("Month CD Value");

        double monthlyRate = annualPercentage / 1200;
        double lastAmount = 0;

        for (int i = 1; i <= numberOfMonths; i++) {
            depositAmount = depositAmount + depositAmount * monthlyRate;
            System.out.printf("%2d -> $%.2f\n", i, depositAmount);
        }
    }
}
