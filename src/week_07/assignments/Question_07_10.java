package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        printMinimumNumberAndIndexInArray(numbers);
    }

    public static void printMinimumNumberAndIndexInArray(double[] array) {
        double minimumNumber = array[0];
        int indexNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumNumber) {
                minimumNumber = array[i];
                indexNumber = i;
            }
        }
        System.out.printf("The minimum number is %.1f index is %d",
                minimumNumber, indexNumber);
    }
}
