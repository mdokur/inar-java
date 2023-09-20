package week_2.assignments;

import java.util.*;

public class Question_02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        double interest = balance * (interestRate / 1200.0);
        System.out.println("The interest is " + (int) (interest * 100000) / 100000.0);
    }
}
