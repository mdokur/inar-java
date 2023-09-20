package week_3.assignments;

import java.util.*;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day : ");
        int numberOfToday = input.nextInt();

        System.out.print("Enter the number of days elapsed since today : ");
        int futureDay = input.nextInt();

        System.out.print("Today is");
        switch (numberOfToday % 7) {
            case 0 -> System.out.print(" Sunday ");
            case 1 -> System.out.print(" Monday ");
            case 2 -> System.out.print(" Tuesday ");
            case 3 -> System.out.print(" Wednesday ");
            case 4 -> System.out.print(" Thursday ");
            case 5 -> System.out.print(" Friday ");
            case 6 -> System.out.print(" Saturday ");
        }
        System.out.print("and the future day is");
        switch ((numberOfToday + futureDay) % 7) {
            case 0 -> System.out.print(" Sunday ");
            case 1 -> System.out.print(" Monday ");
            case 2 -> System.out.print(" Tuesday ");
            case 3 -> System.out.print(" Wednesday ");
            case 4 -> System.out.print(" Thursday ");
            case 5 -> System.out.print(" Friday ");
            case 6 -> System.out.print(" Saturday ");
        }
    }
}
