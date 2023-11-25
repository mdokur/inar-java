package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.next();
        int d10 = 0;

        for (int i = 1; i <= 9; i++) {
            d10 += Integer.parseInt(number.substring(i - 1, i)) * i;
        }
        if (d10 % 11 == 10) {
            System.out.println("The ISBN-10 number is " + number + "X");
        } else {
            System.out.println("The ISBN-10 number is " + number + "" + d10 % 11);
        }
    }
}
