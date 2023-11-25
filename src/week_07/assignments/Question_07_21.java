package week_07.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the slot number: ");
        int numberOfSlot = input.nextInt();

        int[] slotMachine = new int[numberOfSlot];

        dropBalls(numberOfBalls, slotMachine);
        displaySlotMachine(slotMachine);
    }

    public static void displaySlotMachine(int[] machine) {
        int max = findMax(machine);

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < machine.length; j++) {
                if (machine[j] >= i) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < machine.length; i++) {
            System.out.print((i + 1) + " ");


        }
    }

    public static int findMax(int[] machine) {
        int max = machine[0];
        for (int i = 1; i < machine.length; i++) {
            if (machine[i] > max) {
                max = machine[i];
            }
        }
    return max;
    }

    public static void dropBalls(int balls, int[] machine) {
        for (int i = 0; i < balls; i++) {
            String path = "";
            int slotNumber = 0;

            for (int j = 0; j < machine.length; j++) {
                if (isRight()) {
                    path += "R";
                    slotNumber++;
                } else {
                    path += "L";
                }
            }
            machine[slotNumber]++;
            System.out.println(i + ". path : " + path);
        }
    }

    public static boolean isRight() {
        return (int) (Math.random() * 2) == 1;
    }
}
