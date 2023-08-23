package week_3.assignments;

import java.util.*;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount (e.g 11,56):");
        double amount = input.nextDouble();
        amount = (int) (amount * 100);

        int dollars = (int) (amount / 100);
        System.out.println(dollars + " dollars");

        int quarters = (int) (amount % 100) / 25;
        System.out.println(quarters + " quarters");

        int dimes = (int) (amount % 100) % 25 / 10;
        System.out.println(dimes + " dimes");

        int nickels = (int) (amount % 100) % 25 % 10 / 5;
        System.out.println(nickels + " nickels");

        int pennies = (int) (amount % 100) % 25 % 10 % 5;
        System.out.println(pennies + " pennies");
    }
}

