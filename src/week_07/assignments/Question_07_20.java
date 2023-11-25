package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

        doReviseSelectionSort(arr);
        displayArray(arr);
    }

    public static void doReviseSelectionSort(double[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            int max = i;

            for (int j = arr.length-2; j >= 0; j--) {
                if (arr[max] < arr[j]){
                    max= j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    public static void displayArray(double[] arr){
        for (double numbers : arr) {
            System.out.print(numbers + " ");
        }
    }
}
