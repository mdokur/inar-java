package week_2.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();
        int digit1 = (number / 100);
        int digit2 = ((number % 100) / 10);
        int digit3 = (number % 10);
        System.out.println("The sum of the digits is " + (digit1 + digit2 + digit3));
    }
}
