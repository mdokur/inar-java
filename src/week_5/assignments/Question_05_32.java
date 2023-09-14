package week_5.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lottery pick (two distinct digits): ");
        int userLotteryNumber = input.nextInt();
        int lotteryNumber = (int) (Math.random() * (99-10)+10);
        System.out.println("The lottery number is " + lotteryNumber);

        int userLotteryNumberDigit1 = userLotteryNumber % 10;
        int userLotteryNumberDigit2 = userLotteryNumber / 10;
        int lotteryNumberDigit1 = lotteryNumber % 10;
        int lotteryNumberDigit2 = lotteryNumber / 10;

        if (userLotteryNumber == lotteryNumber) {
            System.out.println("Match all of it! You win $10,000");
        } else if (userLotteryNumberDigit1==lotteryNumberDigit2 && userLotteryNumberDigit2 == lotteryNumberDigit1) {
            System.out.println("Match two digit! You win $3,000");
        } else if (userLotteryNumberDigit1==lotteryNumberDigit2 || userLotteryNumberDigit2 == lotteryNumberDigit1) {
            System.out.println("Match one digit! You win $1,000");
        } else
            System.out.println("Sorry, no match!");
    }
}
