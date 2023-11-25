package week_04.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer : ");
        String stringOfISBN = input.nextLine();

        if (stringOfISBN.length() != 9) {
            System.out.println("invalid input!");
            System.exit(1);
        }
        char d1 = stringOfISBN.charAt(0);
        int integerOfD1 = Character.digit(d1, 10);

        char d2 = stringOfISBN.charAt(1);
        int integerOfD2 = Character.digit(d2, 10);

        char d3 = stringOfISBN.charAt(2);
        int integerOfD3 = Character.digit(d3, 10);

        char d4 = stringOfISBN.charAt(3);
        int integerOfD4 = Character.digit(d4, 10);

        char d5 = stringOfISBN.charAt(4);
        int integerOfD5 = Character.digit(d5, 10);

        char d6 = stringOfISBN.charAt(5);
        int integerOfD6 = Character.digit(d6, 10);

        char d7 = stringOfISBN.charAt(6);
        int integerOfD7 = Character.digit(d7, 10);

        char d8 = stringOfISBN.charAt(7);
        int integerOfD8 = Character.digit(d8, 10);

        char d9 = stringOfISBN.charAt(8);
        int integerOfD9 = Character.digit(d9, 10);

        int lastDigitOfISBN = (integerOfD1 + integerOfD2 * 2 + integerOfD3 * 3
                + integerOfD4 * 4 + integerOfD5 * 5
                + integerOfD6 * 6 + integerOfD7 * 7
                + integerOfD8 * 8 + integerOfD9 * 9) % 11;

        if (lastDigitOfISBN == 10) {
            System.out.printf("The ISBN-10 number is %c%c%c%c%c%c%c%c%c%c",
                    d1, d2, d3, d4, d5, d6, d7, d8, d9, 'X');
        } else {
            System.out.printf("The ISBN-10 number is %c%c%c%c%c%c%c%c%c%d",
                    d1, d2, d3, d4, d5, d6, d7, d8, d9, lastDigitOfISBN);
        }
    }
}
