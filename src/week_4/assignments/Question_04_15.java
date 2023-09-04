package week_4.assignments;
import java.util.Scanner;
public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter = input.nextLine();

        int correspondingNumber=-1;

        String two="ABCabc";
        String three="DEFdef";
        String four="GHIghı";
        String five="JKLjkl";
        String six="MNOmno";
        String seven="PQRSpqrs";
        String eight="TUVtuv";
        String nine="WVYZwvyz";

        if(two.contains(letter)){
            correspondingNumber=2;

        } else if (three.contains(letter)) {
            correspondingNumber=3;

        } else if (four.contains(letter)) {
            correspondingNumber=4;

        } else if (five.contains(letter)) {
            correspondingNumber=5;

        } else if (six.contains(letter)) {
            correspondingNumber=6;

        } else if (seven.contains(letter)) {
            correspondingNumber=7;

        } else if (eight.contains(letter)) {
            correspondingNumber=8;

        } else if (nine.contains(letter)) {
            correspondingNumber=9;

        }else {
            System.out.printf("%s is an invalid input",letter);
        }

        if(correspondingNumber>0) {
            System.out.printf("The corresponding number is %d", correspondingNumber);
        }else {
            System.exit(1);
        }
    }
}
