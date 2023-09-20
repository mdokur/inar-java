package week_2.assignments;

import java.util.*;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as integer, for example 1156 for $11,56");
        int amount = input.nextInt();

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
