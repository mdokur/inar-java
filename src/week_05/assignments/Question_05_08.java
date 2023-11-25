package week_05.assignments;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String highestStudent = "";


        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();
        System.out.println("Enter each student's name and score");

        int count = 1;
        while (count <= numberOfStudent) {
            System.out.println("Student: " + count);
            System.out.print("   Name: ");
            String studentName = input.next();
            System.out.print("   Score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestStudent = studentName;
            }
            count++;
        }
        System.out.println("Student with the highest score: " + highestStudent);
    }
}