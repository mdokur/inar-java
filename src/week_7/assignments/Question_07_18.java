package week_7.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        doBubbleSort(array);
        displayArray(array);
    }

    public static void displayArray(double[] arr) {
        for (double number : arr ) {
            System.out.print(number + " ");
        }
    }

    public static void doBubbleSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
