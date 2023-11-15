package week_10.assigments;

import java.math.BigDecimal;

public class Question_10_17 {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal squaredNumber = new BigDecimal(start);
        int count = 0;

        while (count < 10) {
            BigDecimal square = squaredNumber.multiply(squaredNumber);
            if (square.compareTo(number) > 0) {
                System.out.println(square);
                count++;
            }
            squaredNumber = squaredNumber.add(BigDecimal.ONE);
        }
    }
}
