package week_6.assignments;

import java.util.*;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sentence = input.nextLine();

        System.out.printf("The number of letters in the string \"%s\": %d", sentence, countLetters(sentence));
    }

    public static int countLetters(String s){
        int countLetters = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isLetter(s.charAt(i))){
                countLetters++;
            }
        }
        return countLetters;
    }
}
