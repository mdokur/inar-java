package week_7.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        printReverseArray(numbers);
    }

    public static void printReverseArray(int[] numbers) {
        int [] numberOfReverse = new int [10];
        int j = 9;
        for (int i = 0; i < 10; i++) {
            numberOfReverse[i] = numbers[j];
            j--;
        }
        for (int number : numberOfReverse) {
            System.out.print(number + " ");
        }
    }
}

