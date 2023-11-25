package week_04.assignments;

import java.util.*;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimalOfHexNumber = 0;
        String binaryOfHexNumber = " ";
        System.out.print("Enter a hex digit : ");
        String stringOfHexNumber = input.nextLine();
        char charOfHexNumber = stringOfHexNumber.charAt(0);

        if (Character.isDigit(charOfHexNumber)) {
            decimalOfHexNumber = Integer.parseInt(stringOfHexNumber, 16);
            binaryOfHexNumber = Integer.toBinaryString(decimalOfHexNumber);

        } else if (Character.isLetter(charOfHexNumber)) {
            if (charOfHexNumber == 'A'
                    || charOfHexNumber == 'B'
                    || charOfHexNumber == 'C'
                    || charOfHexNumber == 'D'
                    || charOfHexNumber == 'E'
                    || charOfHexNumber == 'F') {
                decimalOfHexNumber = Integer.parseInt(stringOfHexNumber, 16);
                binaryOfHexNumber = Integer.toBinaryString(decimalOfHexNumber);
            } else {
                System.out.printf("%s is an invalid input", stringOfHexNumber);
                System.exit(1);
            }
        } else {
            System.out.printf("%s is an invalid input", stringOfHexNumber);
            System.exit(2);
        }
        System.out.printf("The binary value is %s", binaryOfHexNumber);
    }
}
