package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT:");
        int timeZone = input.nextInt();

        //Total milliseconds from 1970 to today
        long totalMilliseconds = System.currentTimeMillis();

        //Total seconds from 1970 to today
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        //Total minutes from 1970 to today
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        //Total hours from 1970 to today
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + (currentHour + (timeZone)) + ":" + currentMinute + ":" + currentSecond);
    }
}
