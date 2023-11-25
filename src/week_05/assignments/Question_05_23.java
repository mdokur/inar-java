package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double seriesLeftToRight = 0;
        double seriesRightToLeft = 0;

        for (int i = 1; i <= 50000; i++) {
            seriesLeftToRight += (double) 1 / i;
        }
        System.out.println("Summation of series left to right: " + seriesLeftToRight);
        for (int i = 50000; i > 0; i--) {
            seriesRightToLeft += (double) 1 / i;
        }
        System.out.println("Summation of series right to left: " + seriesRightToLeft);
        System.out.println("Summation of the series right to left - " +
                           "Summation of the series left to right: \n" + (seriesRightToLeft - seriesLeftToRight));
    }
}
