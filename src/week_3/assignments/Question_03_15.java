package week_3.assignments;

import java.util.*;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotteryNumber = (int) (Math.random() * (1000 - 100)) + 100;
        int digit1OfLotteryNumber = lotteryNumber % 10;
        int digit2OfLotteryNumber = (lotteryNumber / 10) % 10;
        int digit3OfLotteryNumber = lotteryNumber / 100;

        System.out.print("Enter your lottery pick (three digits) : ");
        int enterNumber = input.nextInt();
        int digit1OfNumber = enterNumber % 10;
        int digit2OfNumber = (enterNumber / 10) % 10;
        int digit3OfNumber = enterNumber / 100;
        System.out.println("The lottery number is " + lotteryNumber);

        if (lotteryNumber == enterNumber) {
            System.out.println("Matched in the exact order! $10,000 Prize!!");
        } else if ((digit1OfLotteryNumber == digit1OfNumber
                || digit1OfLotteryNumber == digit2OfNumber
                || digit1OfLotteryNumber == digit3OfNumber)
                && (digit2OfLotteryNumber == digit1OfNumber
                || digit2OfLotteryNumber == digit2OfNumber
                || digit2OfLotteryNumber == digit3OfNumber)
                && (digit3OfLotteryNumber == digit1OfNumber
                || digit3OfLotteryNumber == digit2OfNumber
                || digit3OfLotteryNumber == digit3OfNumber)) {
            System.out.println("Matched all number but in wrong order! $3,000 Prize ");
        } else if ((digit1OfLotteryNumber == digit1OfNumber)
                || (digit1OfLotteryNumber == digit2OfNumber)
                || (digit1OfLotteryNumber == digit3OfNumber)
                || (digit2OfLotteryNumber == digit1OfNumber)
                || (digit2OfLotteryNumber == digit2OfNumber)
                || (digit2OfLotteryNumber == digit3OfNumber)
                || (digit3OfLotteryNumber == digit1OfNumber)
                || (digit3OfLotteryNumber == digit2OfNumber)
                || (digit3OfLotteryNumber == digit3OfNumber)) {
            System.out.println("Matched one number!!! $1,000 Prize!!!");
        } else
            System.out.println("Sorry no any match :(");
    }
}
