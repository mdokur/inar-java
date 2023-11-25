package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int number = input.nextInt();
        String binaryNumber = "";
        String output = "";

        while (number >= 1) {
            if (number / 2 >= 1) {
                binaryNumber += number % 2;
                number = (number / 2);

            } else if (number == 1) {
                binaryNumber += "1";
                break;
            }
        }
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            output += binaryNumber.charAt(i);

        }
        System.out.println(output);
    }
}
