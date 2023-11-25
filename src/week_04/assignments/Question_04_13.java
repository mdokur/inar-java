package week_04.assignments;
import java.util.*;
public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char charOfletter;
        System.out.print("Enter a letter : ");
        String letter = input.nextLine();

        if (letter.length() > 1) {

            System.out.printf("%s is an invalid input", letter);
            System.exit(1);
        }

        if ((letter.charAt(0) >= 65 && letter.charAt(0) <= 90) || (letter.charAt(0) >= 97 && letter.charAt(0) < 122)) {
            charOfletter = Character.toLowerCase(letter.charAt(0));

            if ((int) (charOfletter) == 97 || (int) (charOfletter) == 101 || (int) (charOfletter) == 105 || (int) (charOfletter) == 111 || (int) (charOfletter) == 117) {
                System.out.printf("%s is a vowel", letter);

            } else {
                System.out.printf("%s is a consonant", letter);
            }

        } else {
            System.out.printf("%s is an invalid input", letter);
        }
    }
}
