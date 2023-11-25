package week_05.assignments;
public class Question_05_05 {
    public static void main(String[] args) {
        final double KILO_TO_POUNDS = 2.2;
        int j = 20;

        System.out.printf("%-10s %10s    |    %-10s %10s\n", "Kilogram", "Pounds", "Pounds", "Kilograms");
        for (int i = 1; i < 199; i++) {
            System.out.printf("%-10d %10.2f    |    %-10d %10.2f\n", i, i * KILO_TO_POUNDS, j, j / KILO_TO_POUNDS);
            j += 5;
        }
    }
}
