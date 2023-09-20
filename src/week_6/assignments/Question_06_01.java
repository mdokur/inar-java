package week_6.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line:");
        getPentagonalNumber(100);
    }
    public static int getPentagonalNumber(int n) {
        int pentagonalNumber = 0;
        for (int i = 1; i <= n; i++) {
            pentagonalNumber = i * (3 * i - 1) / 2;
            System.out.printf("%8d", pentagonalNumber);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        return pentagonalNumber;
    }
}
