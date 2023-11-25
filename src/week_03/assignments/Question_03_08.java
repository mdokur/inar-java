package week_03.assignments;

import java.util.*;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers : ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (secondNumber > thirdNumber) {
                System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
            } else {
                System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
            }

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
            } else {
                System.out.println(firstNumber + " < " + thirdNumber + " < " + secondNumber);
            }
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if (firstNumber > secondNumber) {
                System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
            } else {
                System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
            }
        }
    }
}
