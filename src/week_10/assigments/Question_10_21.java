package week_10.assigments;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        int count = 0;
        String str = Long.MAX_VALUE + "";
        BigInteger number = new BigInteger(str);
        BigInteger number1 = new BigInteger("5");
        BigInteger number2 = new BigInteger("6");

        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        while (count < 10) {
            if ((number.mod(number1) == BigInteger.ZERO) || (number.mod(number2) == BigInteger.ZERO)) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(new BigInteger("1"));
        }
    }
}
