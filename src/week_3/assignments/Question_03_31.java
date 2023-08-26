package week_3.assignments;

import java.util.*;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB:");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int choice = input.nextInt();

        if (choice == 0) {
            System.out.println("Enter the dollar amount:");
            double dollarAmount = input.nextDouble();
            double yuanAmount = (int) (exchangeRate * dollarAmount * 100) / 100.0;
            System.out.println("$" + dollarAmount + " is " + yuanAmount + " yuan ");
        }
        if (choice == 1) {
            System.out.println("Enter the RMB amount:");
            double yuanAmount = input.nextDouble();
            double dollarAmount = (int) (yuanAmount / exchangeRate * 100) / 100.0;
            System.out.println(yuanAmount + " yuan is $" + dollarAmount);
        }
        if (choice != 0 && choice != 1) {
            System.out.println("Incorrect input");
        }
    }
}
