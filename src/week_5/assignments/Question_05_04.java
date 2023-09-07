package week_5.assignments;
public class Question_05_04 {
    public static void main(String[] args) {
        final double MILES_TO_KM = 1.609;

        System.out.printf("%-10s %10s\n", "Miles", "Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d %-10.3f\n", i, i * MILES_TO_KM);
        }
    }
}
