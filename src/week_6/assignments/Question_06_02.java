package week_6.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sumOfDigit = 0;
        while (n != 0) {
            sumOfDigit += (int) (n % 10);
            n /= 10;
        }
        return sumOfDigit;
    }
}
