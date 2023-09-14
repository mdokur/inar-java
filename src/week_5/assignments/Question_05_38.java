package week_5.assignments;
import java.util.Scanner;
public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter a decimal integer: ");
        int number = input.nextInt();

        String octal = "";
        String output = "";

        while (number >=1){
            if(number/8>=1) {
                octal+= number%8;
                number= number/8;

            }else if (number/8 <1) {
                octal+= number;
                break;
            }
        }
        for (int i = octal.length()-1; i>=0; i--){
            output+= octal.charAt(i);
        }
        System.out.println(" The octal of " + number + " is " + output);
    }
}
