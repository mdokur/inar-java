package week_04.assignments;

import java.util.*;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String intValueToString = "";

        System.out.print("Enter a decimal value (0-15) : ");
        int decimalValue = input.nextInt();

        if (decimalValue >= 0 && decimalValue <= 9) {
            int hexValue1 = decimalValue;
            System.out.println("The hex value is " + hexValue1);

        } else if (decimalValue >= 10 && decimalValue <= 15) {
            int hexValue2 = decimalValue % 10;
            switch (hexValue2) {
                case 0 -> intValueToString = "A";
                case 1 -> intValueToString = "B";
                case 2 -> intValueToString = "C";
                case 3 -> intValueToString = "D";
                case 4 -> intValueToString = "E";
                case 5 -> intValueToString = "F";
            }
            System.out.println("The hex value is " + intValueToString);

        } else {
            System.out.printf("%d is an invalid input ", decimalValue);
        }
    }
}
