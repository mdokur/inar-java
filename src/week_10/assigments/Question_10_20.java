package week_10.assigments;

import java.math.BigDecimal;

public class Question_10_20 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100");
        BigDecimal bigDecimal2 = new BigDecimal("1000");
        System.out.println("The e values for i=100 to 1000: ");
        System.out.printf("%-20s%-10s\n", "i", "e");
        System.out.println("----------------------------------");

        while (bigDecimal.compareTo(bigDecimal2) <= 0) {
            System.out.println(bigDecimal + "    " + getApproximateNumber(bigDecimal));
            bigDecimal = bigDecimal.add(new BigDecimal(100));
        }
    }

    public static BigDecimal getApproximateNumber(BigDecimal number) {
        BigDecimal number1 = BigDecimal.ONE;
        BigDecimal result = BigDecimal.ONE;

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(number) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal divideNumber = BigDecimal.ONE.divide(number1.multiply(i), 25, BigDecimal.ROUND_UP);
            result = result.add(divideNumber);
            number1 = number1.multiply(i);
        }
        return result;
    }
}
