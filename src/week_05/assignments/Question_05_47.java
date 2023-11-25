package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double sum2 = 0;

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String code = input.nextLine();

        if (code.length() != 12) {
            System.out.println(code + " is an invalid input");
            System.exit(1);
        }

        for (int i = 0; i < 12; i += 2) {
            sum += Integer.parseInt(String.valueOf(code.charAt(i)));
        }
        for (int i = 1; i < 12; i += 2) {
            sum2 += 3 * (Integer.parseInt(String.valueOf(code.charAt(i))));
        }
        int lastDigit = (int) (10 - (sum + sum2) % 10);

        if (lastDigit == 10) {
            System.out.println("The ISBN-13 number is " + code + "0");
        } else {
            System.out.println("The ISBN-13 number is " + code + lastDigit);
        }
    }
}
