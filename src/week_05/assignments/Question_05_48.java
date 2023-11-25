package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = input.nextLine();
        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }
    }
}
