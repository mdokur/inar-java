package week_04.assignments;

import java.util.*;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");
        char inputOfChar = input.next().charAt(0);

        int uniCode = (int) inputOfChar;
        System.out.println("The Unicode for the character" + inputOfChar + " is " + uniCode);
    }
}
