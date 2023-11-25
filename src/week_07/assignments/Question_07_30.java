package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {

        int[] numbers = createArray();
        boolean result = isConsecutiveFour(numbers);

        System.out.println("The list has" + (result ? "" : " no") + " consecutive fours");
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values:");
        int numberOfValues = input.nextInt();

        System.out.println("Enter the " + numberOfValues + " values:");
        int[] arr = new int[numberOfValues];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static boolean isConsecutiveFour(int[] arr) {
        for (int i = 0; i <= arr.length - 4; i++) {
            int count = 0;
            for (int j = i + 1; j <= i + 3; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
