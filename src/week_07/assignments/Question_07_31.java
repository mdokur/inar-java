package week_07.assignments;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {

        int[] list1 = createFirstArray();
        int[] list2 = createSecondArray();
        int[] mergedArray = mergeArrays(list1, list2);
        sortArray(mergedArray);
        displayMergedArray(mergedArray);
    }

    public static void displayMergedArray(int[] arr) {
        System.out.print("The merged list is ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr1.length; j++) {
            mergedArray[j] = arr1[j];
        }
        for (int k = 0; k < arr2.length; k++) {
            mergedArray[arr1.length + k] = arr2[k];
        }
        return mergedArray;
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

    public static int[] createSecondArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list2 (first digit is number of list):");
        int numberOfArray = input.nextInt();
        int[] arr = new int[numberOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int[] createFirstArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 (first digit is number of list):");
        int numberOfArray = input.nextInt();
        int[] arr = new int[numberOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}

