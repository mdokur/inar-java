package week_6.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the total years: ");
        int year = input.nextInt();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;

        System.out.println("Years Future Value");
        futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
    }

    public static void futureInvestmentValue(double m, double n, int k) {
        for (int i = 1; i <= k; i++) {
            double futureInvestmentValue = m * Math.pow(1 + n, i * 12);
            System.out.printf("%d %.2f\n", i, futureInvestmentValue);
        }
    }
}
