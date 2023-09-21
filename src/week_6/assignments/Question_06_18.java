package week_6.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = input.nextLine();
        System.out.println((isValidPassword(password) ? "Valid" : "Invalid") + "password");


    }
    public static boolean isValidPassword(String password){
        if (isValidPassword(password)) {
            return false;
        }
     return true;
    }
    public static boolean isValidLength(String password){
        if (password.length() >= 8){
            return true;
        }
    return false;
    }
    public static boolean isPasswordOnlyContainsDigitOrLetter(String password){
        for (int i = 0; i <password.length() ; i++) {
            char ch = password.charAt(i);
            Character.isLetterOrDigit(ch);


        }
        return true; 
    }
}
