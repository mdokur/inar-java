package week_2.assignments;
import java.util.Scanner;
public class Question_02_07 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minute = input.nextInt();
        int year = (minute / 525960);
        int day = ((minute % 525960)/1440);
        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days ");
    }
}
