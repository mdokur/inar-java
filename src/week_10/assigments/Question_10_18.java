package week_10.assigments;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;

        while (count < 5) {
            if (IsPrime.isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
