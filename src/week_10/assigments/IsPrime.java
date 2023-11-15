package week_10.assigments;

import java.math.BigInteger;

public class IsPrime {
    public static boolean isPrime(BigInteger number) {
        for (BigInteger i = BigInteger.TWO;
             i.compareTo(number.divide(BigInteger.TWO)) < 0;
             i = i.add(BigInteger.ONE)) {
            if (number.mod(i).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
        }
        return true;
    }
}
