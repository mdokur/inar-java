package week_5.assignments;
import java.util.Scanner;
public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLeapYear = false;

        System.out.print("Enter year : (e.g.,2012) : ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year : ");
        int firstDayOfYear = input.nextInt();

        int dayOfMonth = 0;
        String nameOfDay = "";
        String nameOfMonth = "";

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeapYear = true;
        }
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1 -> nameOfMonth = "January";
                case 2 -> nameOfMonth = "February";
                case 3 -> nameOfMonth = "March";
                case 4 -> nameOfMonth = "April";
                case 5 -> nameOfMonth = "May";
                case 6 -> nameOfMonth = "June";
                case 7 -> nameOfMonth = "July";
                case 8 -> nameOfMonth = "August";
                case 9 -> nameOfMonth = "September";
                case 10 -> nameOfMonth = "October";
                case 11 -> nameOfMonth = "November";
                case 12 -> nameOfMonth = "December";
            }
            switch (month) {
                case 1 -> dayOfMonth = firstDayOfYear;
                case 2 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 3 -> dayOfMonth = (isLeapYear) ? (dayOfMonth + 29) % 7 : (dayOfMonth + 28) % 7;
                case 4 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 5 -> dayOfMonth = (dayOfMonth + 30) % 7;
                case 6 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 7 -> dayOfMonth = (dayOfMonth + 30) % 7;
                case 8 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 9 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 10 -> dayOfMonth = (dayOfMonth + 30) % 7;
                case 11 -> dayOfMonth = (dayOfMonth + 31) % 7;
                case 12 -> dayOfMonth = (dayOfMonth + 30) % 7;
            }
            switch (dayOfMonth) {
                case 0 -> nameOfDay = "Sunday";
                case 1 -> nameOfDay = "Monday";
                case 2 -> nameOfDay = "Tuesday";
                case 3 -> nameOfDay = "Wednesday";
                case 4 -> nameOfDay = "Thursday";
                case 5 -> nameOfDay = "Friday";
                case 6 -> nameOfDay = "Saturday";
            }
            System.out.printf("%9s %d\n", nameOfMonth, year);
            System.out.println("---------------------------------------------------");
            for (int i = 1; i <=7 ; i++) {
                System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");


            }
            System.out.printf("%9s 1, %d is %s\n", nameOfMonth, year, nameOfDay);
        }
    }
}
