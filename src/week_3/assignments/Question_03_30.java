package week_3.assignments;

import java.util.*;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        long currentHour = totalHour % 24;
        int currentHourInGMT = (int) (currentHour) + gmt;

        String timePeriod = " AM";

        if (currentHourInGMT > 12) {
            currentHourInGMT = currentHourInGMT % 12;
            timePeriod = " PM";
        }
        if (currentHourInGMT == 12) {
            currentHourInGMT = 0;
        }
        System.out.println("The current time is " + currentHourInGMT + ":" + currentMinute + ":" + currentSecond + timePeriod);
    }
}
