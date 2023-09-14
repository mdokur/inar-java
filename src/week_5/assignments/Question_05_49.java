package week_5.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vowels = 0;
        int consonats = 0;

        System.out.print("Enter a string: ");
        String st = input.nextLine();
        int length = st.length();
        String stL = st.toLowerCase();

        for (int i = 0; i < length; i++) {
            char ch = stL.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonats++;
                }
            }
        }
        System.out.println("The number of vowels:" + vowels);
        System.out.println("The number of consonants:" + consonats);
        System.out.println(st);
    }
}