package week_10.assigments;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        System.out.println("p" + "           " + "2^p-1");
        BigInteger numberLast = new BigInteger("100");
        for (BigInteger number = BigInteger.TWO; number.compareTo(numberLast) <= 0; number = number.add(BigInteger.ONE)) {
            BigInteger mersennePrimeNumber = getMersennePrimeNumber(number);

            if (isPrime(number) && isPrime(mersennePrimeNumber)) {
                System.out.printf("%-15d%-5d\n", number, mersennePrimeNumber);
            }

        }
    }

    public static BigInteger getMersennePrimeNumber(BigInteger number) {
        BigInteger mersennePrimeNumber = BigInteger.TWO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(number) < 0; i = i.add(BigInteger.ONE)) {
            mersennePrimeNumber = mersennePrimeNumber.multiply(BigInteger.TWO);
        }
        return mersennePrimeNumber.subtract(BigInteger.ONE);
    }

    public static boolean isPrime(BigInteger number) {
        for (BigInteger i = BigInteger.TWO;
             i.compareTo(number.divide(BigInteger.TWO)) <= 0;
             i = i.add(BigInteger.ONE)) {
            if (number.remainder(i).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
        }
        return true;
    }
}
