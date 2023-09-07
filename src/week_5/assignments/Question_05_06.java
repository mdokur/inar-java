package week_5.assignments;

public class Question_05_06 {
    public static void main(String[] args) {
        final double MILES_TO_KM = 1.609;
        int j = 20;

        System.out.printf("%-10s %10s    |    %-10s %10s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d %-10.3f    |    %-10d %-10.3f\n", i, i * MILES_TO_KM, j, j / MILES_TO_KM);
            j += 5;
        }
    }
}
