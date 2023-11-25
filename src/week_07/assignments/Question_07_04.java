package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the scores: (negative number signifies end): ");
        int[] scores = new int[100];


        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] < 0) {
                scores[i] = 0;
                break;
            }
        }

        double averageOfScores = getAverageOfScores(scores);
        printScoresStatus(scores, averageOfScores);
    }

    public static void printScoresStatus(int[] array, double average) {
        int aboveCount = 0;
        int equalCount = 0;
        int belowCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] > average) {
                    aboveCount++;
                } else if (array[i] == average) {
                    equalCount++;
                } else {
                    belowCount++;
                }
            }
        }
        System.out.printf("Average Of Scores: %.2f \n" +
                          "Number of scores above average: %d\n" +
                          "Number of scores equal to average: %d\n" +
                          "Number of scores below average: %d", average, aboveCount, equalCount, belowCount);
    }

    public static double getAverageOfScores(int[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }
        return sum / count;
    }
}
