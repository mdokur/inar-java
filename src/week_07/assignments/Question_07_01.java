package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();

        System.out.println("Enter " + numberOfStudent + " scores: ");
        int[] scoreOfStudent = new int[numberOfStudent];

        for (int i = 0; i < numberOfStudent; i++) {
            scoreOfStudent[i] = input.nextInt();
        }
        int bestGrade = findBestGrade(scoreOfStudent, numberOfStudent);
        printScores(scoreOfStudent, numberOfStudent, bestGrade);
    }

    public static int findBestGrade(int[] scoreOfStudent, int numberOfStudent) {
        int bestGrade = 0;
        for (int i = 0; i < numberOfStudent; i++) {
            if (scoreOfStudent[i] > bestGrade) {
                bestGrade = scoreOfStudent[i];
            }
        }
        return bestGrade;
    }

    public static void printScores(int[] scoreOfStudent, int numberOfStudent, int bestGrade) {
        for (int i = 0; i < numberOfStudent; i++) {
            if (scoreOfStudent[i] >= (bestGrade - 10)) {
                System.out.printf("Student %d score is %d and grade is A\n", i, scoreOfStudent[i]);
            } else if (scoreOfStudent[i] >= (bestGrade - 20)) {
                System.out.printf("Student %d score is %d and grade is B\n", i, scoreOfStudent[i]);
            } else if (scoreOfStudent[i] >= (bestGrade - 30)) {
                System.out.printf("Student %d score is %d and grade is C\n", i, scoreOfStudent[i]);
            } else if (scoreOfStudent[i] >= (bestGrade - 40)) {
                System.out.printf("Student %d score is %d and grade is D\n", i, scoreOfStudent[i]);
            } else {
                System.out.printf("Student %d score is %d and grade is F\n", i, scoreOfStudent[i]);
            }
        }
    }
}
