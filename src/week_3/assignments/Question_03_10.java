package week_3.assignments;

import java.util.*;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int realAnswer = number1 + number2;

        System.out.println("What is " + number1 + " + " + number2 + " = ?");
        int answer = input.nextInt();

        if (answer == realAnswer) {
            System.out.println("You are correct !");
        } else {
            System.out.println("You are wrong ! " + number1 +
                    " + " + number2 + " should be " + realAnswer);
        }
    }
}

