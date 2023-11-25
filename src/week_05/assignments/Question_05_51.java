package week_05.assignments;
import java.util.Scanner;
public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = input.nextLine();
        String theLargestCommonPrefix = "";

        int minLength = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i <= minLength; i++) {
            char firstStringCharacters = firstString.charAt(i);
            char secondStringCharacters = secondString.charAt(i);

            if (firstStringCharacters == secondStringCharacters) {
                theLargestCommonPrefix += firstString.charAt(i);
            }else{
                break;
            }
        }
        if(!theLargestCommonPrefix.isEmpty()) {
            System.out.println("The common prefix is " + theLargestCommonPrefix);
        }else{
            System.out.println(firstString + " and " + secondString + " have no common prefix");
        }
    }
}
