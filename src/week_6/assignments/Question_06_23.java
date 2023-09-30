package week_6.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();

        System.out.print("Enter a character that you want to count: ");
        char ch = input.nextLine().charAt(0);

        System.out.println(count(sentence, ch));
    }

    public static int count(String str, char a) {
        int number = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == a) {
                number++;
            }
        }
        return number;
    }
}
