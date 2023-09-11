package week_5.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double interestRate = 5;

        System.out.println("Enter the Loan Amount:");
        int loanAmount = input.nextInt();
        System.out.println("Enter the number of years:");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        for (int i = 1; i <= numberOfYears; i++) {
            interestRate += 0.125;
            double monthlyPayment = loanAmount * (interestRate / 1200) /
                    (1 - 1 / Math.pow(1 + (interestRate / 1200), numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%%%-16.3f %-19.2f %.2f\n", interestRate, monthlyPayment, totalPayment);
        }
    }
}
