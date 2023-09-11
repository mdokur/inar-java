package week_5.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int inputInteger = input.nextInt();
        int i = 2;

        while (inputInteger >= i) {
            if (inputInteger % i == 0) {
                System.out.printf("%d, ", i);
                inputInteger = inputInteger / i;
            } else {
                i++;
            }
        }
    }
}
