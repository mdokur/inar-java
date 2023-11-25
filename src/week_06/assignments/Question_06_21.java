package week_06.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = input.nextLine();

        getNumber(word);
    }

    public static void getNumber(String word) {
        String wordUpperCase = word.toUpperCase();
        for (int i = 0; i < wordUpperCase.length(); i++) {
            if (wordUpperCase.charAt(i) == '_' || wordUpperCase.charAt(i) == ',' || wordUpperCase.charAt(i) == '@') {
                System.out.print("1");
            } else if (Character.isLetter(wordUpperCase.charAt(i))) {
                if (wordUpperCase.charAt(i) == 'A' || wordUpperCase.charAt(i) == 'B' || wordUpperCase.charAt(i) == 'C') {
                    System.out.print("2");
                } else if (wordUpperCase.charAt(i) == 'D' || wordUpperCase.charAt(i) == 'E' || wordUpperCase.charAt(i) == 'F') {
                    System.out.print("3");
                } else if (wordUpperCase.charAt(i) == 'G' || wordUpperCase.charAt(i) == 'H' || wordUpperCase.charAt(i) == 'I' || wordUpperCase.charAt(i) == 'İ') {
                    System.out.print("4");
                } else if (wordUpperCase.charAt(i) == 'J' || wordUpperCase.charAt(i) == 'K' || wordUpperCase.charAt(i) == 'L') {
                    System.out.print("5");
                } else if (wordUpperCase.charAt(i) == 'M' || wordUpperCase.charAt(i) == 'N' || wordUpperCase.charAt(i) == 'O') {
                    System.out.print("6");
                } else if (wordUpperCase.charAt(i) == 'P' || wordUpperCase.charAt(i) == 'Q' || wordUpperCase.charAt(i) == 'R' || wordUpperCase.charAt(i) == 'S') {
                    System.out.print("7");
                } else if (wordUpperCase.charAt(i) == 'T' || wordUpperCase.charAt(i) == 'U' || wordUpperCase.charAt(i) == 'V') {
                    System.out.print("8");
                } else if (wordUpperCase.charAt(i) == 'W' || wordUpperCase.charAt(i) == 'X' || wordUpperCase.charAt(i) == 'Y' || wordUpperCase.charAt(i) == 'Z') {
                    System.out.print("9");
                }
            } else {
                System.out.print(word.charAt(i));
            }
        }
    }
}
