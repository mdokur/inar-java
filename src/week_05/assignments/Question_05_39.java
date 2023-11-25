package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        double firstCommission = 5000 * 0.05;
        double secondCommission = 5000 * 0.10;
        double totalEarn = 0;

        double count = 1;
        while (totalEarn <= 30000) {
            double thirdCommission = count * 0.12;
            count += 0.01;
            totalEarn = firstCommission + secondCommission + thirdCommission;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.2f", 10000 + count);
    }
}
