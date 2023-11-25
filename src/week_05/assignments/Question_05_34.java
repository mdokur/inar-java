package week_05.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerWins = 0;
        int userWins = 0;

        do {
            int computerGuess = (int) (Math.random() * 3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int answer = input.nextInt();
            System.out.print("The computer is ");
            switch (computerGuess) {
                case 0 -> System.out.print("scissor.");
                case 1 -> System.out.print("rock.");
                case 2 -> System.out.print("paper.");
            }
            System.out.print(" You are ");
            switch (answer) {
                case 0 -> System.out.print("scissor.");
                case 1 -> System.out.print("rock.");
                case 2 -> System.out.print("paper.");
            }
            if (computerGuess == answer) {
                System.out.print(" It is a draw.");
            } else if ((answer == 0 && computerGuess == 2) ||
                    (answer == 1 && computerGuess == 0) ||
                    (answer == 2 && computerGuess == 1)) {
                System.out.print(" You won.");
                userWins++;
            } else {
                System.out.print(" You lose.");
                computerWins++;
            }
            System.out.println();
            System.out.println("Computer wins: " + computerWins);
            System.out.println("User wins: " + userWins + "\n");
        } while (Math.abs(computerWins - userWins) <= 2);
    }
}
