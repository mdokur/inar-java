package week_3.assignments;

import java.util.*;

public class Question_03_24 {
    public static void main(String[] args) {
        System.out.print("The card that you picked up");
        int rank = (int) (Math.random() * 14);
        switch (rank) {
            case 1 -> System.out.print(" Ace ");
            case 2 -> System.out.print(" 2 ");
            case 3 -> System.out.print(" 3 ");
            case 4 -> System.out.print(" 4 ");
            case 5 -> System.out.print(" 5 ");
            case 6 -> System.out.print(" 6 ");
            case 7 -> System.out.print(" 7 ");
            case 8 -> System.out.print(" 8 ");
            case 9 -> System.out.print(" 9 ");
            case 10 -> System.out.print(" 10 ");
            case 11 -> System.out.print(" Jack ");
            case 12 -> System.out.print(" Queen ");
            case 13 -> System.out.print(" King ");
        }
        System.out.print("of");
        int suit = (int) (Math.random() * 5);
        switch (suit) {
            case 1 -> System.out.print(" Clubs ");
            case 2 -> System.out.print(" Diamonds ");
            case 3 -> System.out.print(" Hearts ");
            case 4 -> System.out.print(" Spades ");
        }
    }
}
