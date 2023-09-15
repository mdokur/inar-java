package week_5.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter a string: ");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 90 && word.charAt(i) >= 65) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
