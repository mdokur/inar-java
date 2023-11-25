package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            int inputNumber = input.nextInt();
            count[inputNumber - 1]++;
        }
        printDistinctNumbers(count);
    }

    public static void printDistinctNumbers(int[] array) {
        System.out.print("The distinct numbers are: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(i + 1 + " ");
                count++;
            }
        }
        System.out.println("\nThe number of distinct numbers is: " + count);
    }
}
