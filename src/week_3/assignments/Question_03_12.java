package week_3.assignments;

import java.util.*;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer : ");
        int number = input.nextInt();

        int digit1 = number % 10;
        int digit3 = number / 100;

        if (digit3 == digit1) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
