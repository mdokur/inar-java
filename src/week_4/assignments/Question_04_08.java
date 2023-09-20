package week_4.assignments;

import java.util.*;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code:");
        int codeOfAscii = input.nextInt();

        char charOfCode = (char) codeOfAscii;

        System.out.println("The character for ASCII code " + codeOfAscii + " is " + charOfCode);
    }
}
