package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {

        int[] number = createArray();
        displayArray(number);
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    System.out.println(arr[i] + "" + arr[j]);
                }
            }
        }
    }
}
