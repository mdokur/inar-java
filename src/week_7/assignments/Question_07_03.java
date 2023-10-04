package week_7.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between '1' and '100': ");

        int[] inputNumbers = new int[100];
        int count = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = input.nextInt();
            if (inputNumbers[i] == 0) {
                break;
            }
            count++;
        }

        int[] counts = new int[count];

        for (int i = 0; i < count; i++) {
            counts[inputNumbers[i] % 100]++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(inputNumbers[i] + " occur " + counts[i] + " time");
        }
    }
}
