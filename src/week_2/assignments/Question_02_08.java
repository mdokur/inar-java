package week_2.assignments;
import java.util.Scanner;
public class Question_02_08 {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int timeZone = input.nextInt();
        //1970'den bugune kadar gecen toplam milisaniye
        long totalMilliseconds = System.currentTimeMillis();
        //1970'den bugüne kadar geçen toplam saniye
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        //1970'den bugüne kadar geçen toplam dakika
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        //1970'den bugüne kadar geçen toplam saat
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + (currentHour+(timeZone)) + ":" + currentMinute + ":" + currentSecond);
    }
}
