package week_09.assigments;
import java.util.Date;
public class Question_09_03 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = 10000;

        while (time <= 100000000000L) {
            date.setTime(time);
            System.out.println("For elapsed " + time + " time is " + date.toString());
            time *= 10;
        }
    }
}

