package week_3.assignments;

import java.util.*;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as integer : ");
        int month = input.nextInt();
        System.out.print("Enter the year as integer : ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1 -> System.out.println("January " + year + " had 31 days");
            case 2 -> System.out.println("February " + year + " had " + ((isLeapYear) ? 29 : 28) + " days");
            case 3 -> System.out.println("March " + year + " had 31 days");
            case 4 -> System.out.println("April " + year + " had 30 days");
            case 5 -> System.out.println("May " + year + " had 31 days");
            case 6 -> System.out.println("June " + year + " had 30 days");
            case 7 -> System.out.println("July " + year + " had 31 days");
            case 8 -> System.out.println("Agust " + year + " had 31 days");
            case 9 -> System.out.println("September " + year + " had 30 days");
            case 10 -> System.out.println("October " + year + " had 31 days ");
            case 11 -> System.out.println("November " + year + " had 30 days ");
            case 12 -> System.out.println("December " + year + " had 31 days ");
        }
    }
}
