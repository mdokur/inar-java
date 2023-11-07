package week_9.assigments;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("Current year: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        System.out.println("After setTime:");
        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println("Current year: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
