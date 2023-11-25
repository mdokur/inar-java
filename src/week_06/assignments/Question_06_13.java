package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i     m(i)");
        System.out.println("------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-5d %.4f\n", i, sumSeries(i));
        }
    }

    public static double sumSeries(double k) {
        double sumSeries = 0.0;
        for (int i = 1; i <= k; i++) {
            sumSeries += (double) i / (i + 1);
        }
        return sumSeries;
    }
}
