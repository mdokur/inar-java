package week_10.assigments;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger number1 = new BigInteger("2");
        BigInteger number2 = new BigInteger("3");


        while (count < 10) {
            if ((number.mod(number1) == BigInteger.ZERO) || (number.mod(number2) == BigInteger.ZERO)) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(new BigInteger("1"));
        }
    }
}
