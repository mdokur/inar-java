package week_3.assignments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flipOfCoin = (int) (Math.random() * 10) % 2;
        System.out.println("Guess the flip of coin 0 represent head and 1 represent tail :");
        int guess = input.nextInt();

        if (flipOfCoin == guess) {
            System.out.println("Your guess is correct");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}
