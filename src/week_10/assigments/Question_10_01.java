package week_10.assigments;

public class Question_10_01 {
    public static void main(String[] args) {
        Time currentTime = new Time();
        Time time1 = new Time(555550000);

        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
    }
}
