package week_6.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliSeconds = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milliSeconds));
    }

    public static String convertMillis(long millis) {
        String output = "";
        long totalSeconds = millis / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        output += (totalHours);
        output += (":" + currentMinute);
        output += (":" + currentSecond);

        return output;
    }
}
