package week_7.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        int gcd = greatestCommonDivisor(numbers);
        System.out.println("The greatest common divisor is " + gcd);
    }

    public static int greatestCommonDivisor(int[] numbers) {
        int smallestNumber = getSmallest(numbers);
        int gcd = 1;

        for (int i = 2; i <= smallestNumber; i++) {
            boolean divised = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % i != 0) {
                    divised = false;
                    break;
                }
            }
            if (divised) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int getSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE; // numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
