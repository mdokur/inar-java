package week_3.assignments;

import java.util.*;

public class Question_03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        boolean and = false;
        boolean or = false;
        boolean xor = false;
        if (number % 5 == 0 && number % 6 == 0) {
            and = true;
        }
        if (number % 5 == 0 || number % 6 == 0) {
            or = true;
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            xor = true;
        }
        System.out.println("Is " + number + " divisible by 5 and 6 ? " + and);
        System.out.println("Is " + number + " divisible by 5 or 6 ? " + or);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both ? " + xor);
    }
}
