package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integer numbers to exclude from random (1-54):");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int generatedNumber = getGenerateNumber(numbers);
        System.out.println("Number generated: " + generatedNumber);
    }

    public static int getGenerateNumber(int[] array) {
        int generatedNumber = (int) (Math.random() * 55);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == generatedNumber) {
                generatedNumber = (int) (Math.random() * 55);
                i = 0;
            }
        }
        return generatedNumber;
    }
}
