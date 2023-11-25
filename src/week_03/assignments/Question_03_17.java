package week_03.assignments;

import java.util.*;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int) (Math.random() * 3);
        System.out.println("Choose one:" + "\n Scıssor (0)" + "\n Rock (1)" + "\n Paper (2)");
        int guess = input.nextInt();

        System.out.print("The computer is ");
        switch (computer) {
            case 0 -> System.out.print("scissor.");
            case 1 -> System.out.print("rock.");
            case 2 -> System.out.print("paper.");
        }
        System.out.print(" You are ");
        switch (guess) {
            case 0 -> System.out.print("scissor.");
            case 1 -> System.out.print("rock.");
            case 2 -> System.out.print("paper.");
        }
        if (guess == computer) {
            System.out.print(" It is a draw.");
        } else if ((guess == 1 && computer == 0) || (guess == 2 && computer == 1) || (guess == 0 && computer == 2)) {
            System.out.print(" You won!");
        } else
            System.out.print(" You lost.");
    }
}

