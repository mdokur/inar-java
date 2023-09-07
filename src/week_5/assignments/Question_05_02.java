package week_5.assignments;

import java.util.*;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long beginTime = System.currentTimeMillis();
        int correctNumber = 0;
        int wrongNumber = 0;
        String results = "";

        for (int i = 0; i < 10; i++) {
            int number1 = (int) (Math.random() * 14 + 1);
            int number2 = (int) (Math.random() * 14 + 1);
            System.out.printf("What is %d + %d? ", number1, number2);
            int answer = input.nextInt();
            if (answer == number1 + number2) {
                System.out.println("You are correct");
                correctNumber++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.printf("%d + %d should be %d\n", number1, number2, number1 + number2);
                wrongNumber++;
            }
            results += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer) ? " correct" : " wrong ");
        }
        long finishTime = System.currentTimeMillis();
        System.out.printf("\n\nCorrect count is %d\n" +
                "Wrong count is %d\n" +
                "Test time is %d seconds\n\n", correctNumber, wrongNumber, (finishTime - beginTime) / 1000);
        System.out.println(results);
    }
}
