package week_6.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year      Days in the year");
        System.out.println("--------------------------");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-15d %d\n", i, numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int numberOfDaysInAYear = 0;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            numberOfDaysInAYear = 366;
        } else {
            numberOfDaysInAYear = 365;
        }
        return numberOfDaysInAYear;
    }
}
