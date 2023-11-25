package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN : ");
        String stringOfSSN = input.nextLine();

        int firstIndexOfHyphen = stringOfSSN.indexOf('-');
        int lastIndexOfHyphen = stringOfSSN.lastIndexOf('-');

        String firstPartOfSSN = stringOfSSN.substring(0, firstIndexOfHyphen);
        String secondPartOfSSN = stringOfSSN.substring(firstIndexOfHyphen + 1, lastIndexOfHyphen);
        String lastPartOfSSN = stringOfSSN.substring(lastIndexOfHyphen + 1);

        if ((stringOfSSN.length() == 11)
                && (firstPartOfSSN.length() == 3)
                && (secondPartOfSSN.length() == 2)
                && (lastPartOfSSN.length() == 4)) {

            System.out.printf("%s is a valid social security number", stringOfSSN);
        } else {
            System.out.printf("%s is an invalid social security number", stringOfSSN);
        }

    }
}

