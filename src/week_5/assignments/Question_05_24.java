package week_5.assignments;
public class Question_05_24 {
    public static void main(String[] args) {
        int j = 3;
        double sumSeries = 0;

        for (int i = 1; i <= 97; i += 2) {
            sumSeries += (double) i / j;
            j += 2;
        }
        System.out.println("Sum of series: " + sumSeries);
    }
}
