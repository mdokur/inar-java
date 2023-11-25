package week_07.assignments;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {

        int[] list1 = createArray();
        int[] list2 = createArray2();

        System.out.println("Two lists are " + (isEqual(list1, list2) ? "" : "not ") + "strictly identical");
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

