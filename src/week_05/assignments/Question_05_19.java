package week_05.assignments;

import java.util.Scanner;

public class Question_05_19 {
    public static void main(String[] args) {
        for (int lines = 1; lines < 8; lines++) {
            for (int i = 1; i < 8 - lines; i++) {
                System.out.printf("%3s", " ");
            }
            for (int i = 1; i >= 1; i--) {
                System.out.printf("%-3d", i);
            }
            System.out.println();
        }
    }
}
