package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("SalesAmount     Commission");
        System.out.println("---------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
            double k = computeCommission(i);
            System.out.printf("%-15d %.2f\n", i, k);
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        return commission;
    }
}
