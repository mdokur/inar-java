package week_6.assignments;

public class Question_06_24 {
    public static void main(String[] args) {
        printCalender();
    }
    public static void printCalender() {
        System.out.print("Current time and date is: ");
        long milliSecond = System.currentTimeMillis();

        int currentSecond = getCurrentSecond(milliSecond);
        int currentMinute = getCurrentMinute(milliSecond);
        int currentHour = getCurrentHour(milliSecond);

        System.out.print(currentHour + ":" + currentMinute + ":" + currentSecond);

        int currentYear = getCurrentYear(milliSecond);
        int currentMonth = getCurrentMonth(milliSecond);
        int currentDay = getCurrentDay(milliSecond);

        System.out.print(currentDay + " / " + currentMonth + " / " + currentYear);
    }

    public static long getTotalSecond(long milliSecond) {
        return (int) (milliSecond / 1000);
    }

    public static int getCurrentSecond(long milliSecond) {
        return (int) (getTotalSecond(milliSecond) % 60);
    }

    public static long getTotalMinute(long milliSecond) {
        return getTotalSecond(milliSecond) / 60;
    }

    public static int getCurrentMinute(long milliSecond) {
        return (int) (getTotalMinute(milliSecond) % 60);
    }

    public static long getTotalHours(long milliSecond) {
        return getTotalMinute(milliSecond) / 60;
    }

    public static int getCurrentHour(long milliSecond) {
        return (int) (getTotalHours(milliSecond) % 60);
    }

    public static long getTotalDay(long milliSecond) {
        return getTotalHours(milliSecond) / 24;
    }

    public static int getCurrentDay(long milliSecond) {
        int totalDay = getTotalDayInCurrentYear(milliSecond);
        int currentMonth = getCurrentMonth(milliSecond);
        int sum = 0;
        for (int i = 1; i < currentMonth; i++) {
            sum += numberOfDayInMonth(getCurrentYear(milliSecond), i);
        }
        int currentDay = totalDay - sum + 1;
        return currentDay;
    }

    public static int getCurrentYear(long milliSecond) {
        int year = 1970;
        long totalDay = getTotalDay(milliSecond);
        while (getTotalDay(milliSecond) >= 365) {
            totalDay -= 365;
            year++;
        }
        return year;
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getTotalInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static int getTotalDayInCurrentYear(long milliSecond) {
        int year = 1970;
        long totalDay = getTotalDay(milliSecond);
        while (totalDay >= 365) {
            totalDay -= 365;
            year++;
        }
        return (int) totalDay;
    }

    public static int getCurrentMonth(long milliSecond) {
        int totalDay = getTotalDayInCurrentYear(milliSecond);
        int month = 1;
        int year = getCurrentYear(milliSecond);
        while (totalDay > numberOfDayInMonth(year, month)) {
            month++;
            totalDay -= numberOfDayInMonth(year, month);
        }
        return month;
    }

    public static int numberOfDayInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 30;
        }
    }

}
