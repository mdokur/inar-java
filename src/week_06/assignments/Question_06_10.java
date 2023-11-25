package week_06.assignments;

import java.util.Scanner;

public class Question_06_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the last number: ");
        int lastNumber = input.nextInt();

        int count = 0;
        for (int i = 2; i <= lastNumber; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.printf("The number of prime numbers less than %d is: %d", lastNumber, count);
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
