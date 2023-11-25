package week_03.assignments;

import java.util.*;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer :");
        int isbn = input.nextInt();

        int digit9 = isbn % 10;
        int digit8 = isbn / 10 % 10;
        int digit7 = isbn / 100 % 10;
        int digit6 = isbn / 1000 % 10;
        int digit5 = isbn / 10000 % 10;
        int digit4 = isbn / 100000 % 10;
        int digit3 = isbn / 1000000 % 10;
        int digit2 = isbn / 10000000 % 10;
        int digit1 = isbn / 100000000 % 10;
        int lastDigit = ((digit1) + (digit2 * 2) + (digit3 * 3) +
                (digit4 * 4) + (digit5 * 5) + (digit6 * 6) +
                (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;

        if (lastDigit == 10) {
            System.out.println("The ISBN-10 number is " + digit1 + digit2 + digit3 +
                    digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + digit1 + digit2 + digit3 +
                    digit4 + digit5 + digit6 + digit7 + digit8 + digit9 + lastDigit);
        }
    }
}