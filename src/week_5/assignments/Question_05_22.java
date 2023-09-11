package week_5.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextInt();

        double monthlyPayment = (loanAmount * (annualInterestRate / 1200) /
                (1 - 1 / Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12)) * 100) / 100.0;
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

        double totalPayment = (monthlyPayment * numberOfYears * 12 * 100) / 100.0;
        System.out.printf("Total Payment: %.2f\n ", totalPayment);

        double balance = loanAmount;
        System.out.print("\n\nPayment#            Interest       Principal      Balance\n");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = annualInterestRate / 1200 * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;

            if ((i == numberOfYears * 12) && (balance == 0)) {
                principal = monthlyPayment + balance;
            }
            System.out.printf("%-20d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
        }
        System.out.println();
    }
}
