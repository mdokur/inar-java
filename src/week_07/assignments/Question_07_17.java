package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] nameOfStudents = new String[numberOfStudents];
        int[] score = new int[numberOfStudents];

        System.out.println("Enter the name a score for each student: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            nameOfStudents[i] = input.next();

            System.out.println("Score: ");
            score[i] = input.nextInt();
        }
        display(nameOfStudents, score);
    }

    public static void display(String[] name, int[] score) {
        for (int i = 0; i < score.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < score.length; j++) {
                if (score[max] < score[j]) {
                    max = j;
                    name[max] = name[j];
                }
            }

            int temp = score[i];
            score[i] = score[max];
            score[max] = temp;

            String temp1= name[i];
            name [i]= name[max];
            name[max]= temp1;
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(name[i]);
        }
    }
}
