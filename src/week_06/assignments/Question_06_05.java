package week_06.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three different numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double number1, double number2, double number3) {
        double biggest = Math.max(Math.max(number1, number2), number3);
        double smallest = Math.min(Math.min(number1, number2), number3);
        double middle = 0;
        if (number1 != biggest && number1 != smallest) {
            middle = number1;
        } else if (number2 != biggest && number2 != smallest) {
            middle = number2;
        } else if (number3 != biggest && number3 != smallest) {
            middle = number3;
        }
        System.out.println(smallest + " " + middle + " " + biggest);
    }
}
