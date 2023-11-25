package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display an integer reversed: ");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(Question_06_03.reverse(number));
    }
}
