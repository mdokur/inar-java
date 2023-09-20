package week_6.assignments;
import java.util.Scanner;
public class Question_06_03 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        System.out.print(number);
        System.out.println((number == reverse(number)) ? " is a palindrome." : " is not a palindrome.");

    }
    public static int reverse(int number){
        String number2 = number + "";
        String digit = "";
        for (int i = number2.length()-1; i >=0  ; i--) {
            digit += number2.charAt(i);
        }
       int newDigit = Integer.parseInt(digit);
        return newDigit;
    }
}
