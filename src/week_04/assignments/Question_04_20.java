package week_04.assignments;
import java.util.Scanner;
public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String inputString = input.nextLine();

        int lengthOfString = inputString.length();
        char firstCharacterOfString = inputString.charAt(0);

        System.out.printf("Length of the string : %d\n" + "First character of the string : %c", lengthOfString, firstCharacterOfString);
    }
}
