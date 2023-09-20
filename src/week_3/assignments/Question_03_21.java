package week_3.assignments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g.,2012) : ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int dayOfMonth = input.nextInt();

        if ((month == 1) || (month == 2)) {
            month = (month == 1) ? 13 : 14;
            year = year - 1;
        }

        int century = (year / 100);
        int yearOfCentury = year % 100;
        int dayOfWeek = ((dayOfMonth) + ((26 * (month + 1)) / 10) + (yearOfCentury)
                + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;

        String nameOfDay = "";

        switch (dayOfWeek) {
            case 0 -> nameOfDay = "Saturday";
            case 1 -> nameOfDay = "Sunday";
            case 2 -> nameOfDay = "Monday";
            case 3 -> nameOfDay = "Tuesday";
            case 4 -> nameOfDay = "Wednesday";
            case 5 -> nameOfDay = "Thursday";
            case 6 -> nameOfDay = "Friday";
        }
        System.out.println("Day of the week is " + nameOfDay);
    }
}