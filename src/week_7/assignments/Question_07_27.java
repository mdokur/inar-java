package week_7.assignments;

import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {

        int[] list1 = createArray();
        sortArray(list1);

        int[] list2 = createArray2();
        sortArray(list2);

        System.out.println("Two lists are " + (isEqual(list1, list2) ? "" : "not ") + "identical");
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 (First integer is the number of digits):");
        int number = input.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int[] createArray2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list2 (First integer is the number of digits):");
        int number = input.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
