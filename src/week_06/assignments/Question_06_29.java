package week_06.assignments;

import java.util.Scanner;

public class Question_06_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        twinPrimeNumbers(number);

    }

    public static void twinPrimeNumbers(int i) {
        for (int j = 2; j < i; j++) {
            if (isPrime(j) && isPrime(j + 2)) {
                System.out.printf("( %d , %d )\n", j, j + 2);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
