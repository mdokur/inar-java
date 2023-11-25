package week_04.assignments;
import java.util.Scanner;
public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDays = 30;

        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter a month : ");
        String month = input.next();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case "Jan" -> numberOfDays = 31;
            case "Feb" -> numberOfDays = (isLeapYear) ? 29 : 28;
            case "Mar" -> numberOfDays = 31;
            case "Apr" -> numberOfDays = 30;
            case "May" -> numberOfDays = 31;
            case "Jun" -> numberOfDays = 30;
            case "Jul" -> numberOfDays = 31;
            case "Agu" -> numberOfDays = 31;
            case "Sep" -> numberOfDays = 30;
            case "Oct" -> numberOfDays = 31;
            case "Nov" -> numberOfDays = 30;
            case "Dec" -> numberOfDays = 31;
            default -> System.out.println("invalid input!");
        }
        System.out.printf("%s %d has %d days", month, year, numberOfDays);
    }
}
