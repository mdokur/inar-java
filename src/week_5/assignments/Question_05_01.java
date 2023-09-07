package week_5.assignments;

import java.util.Scanner;

import static java.lang.System.exit;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int i = 0;
        int number;
        double numberTotal = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        do {
            number = input.nextInt();
            if (number > 0) {
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            } else {
            }
            numberTotal += number;
        } while (number != 0);

        double numberAverage = (double) numberTotal / (positiveNumbers + negativeNumbers);

        System.out.println("The number of positives is " + positiveNumbers);
        System.out.println("The number of negatives is " + negativeNumbers);
        System.out.println("The total is " + numberTotal);
        System.out.printf("The average is %.2f", numberAverage);
    }
}
