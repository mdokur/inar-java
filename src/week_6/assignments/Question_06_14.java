package week_6.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i     m(i)");
        System.out.println("-----------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-5d %.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int k) {
        double estimatePi = 0;
        double lastEstimatePi = 0;
        for (int i = 1; i <= k; i++) {
            estimatePi += Math.pow(-1, i + 1) / (2 * i - 1);
            lastEstimatePi = 4 * estimatePi;
        }
        return lastEstimatePi;
    }
}
