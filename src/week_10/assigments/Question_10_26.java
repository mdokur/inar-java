package week_10.assigments;

import java.util.Scanner;

public class Question_10_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                index = i;
            }
        }
        String partOne = str.substring(0, index);
        int partOneInteger = Integer.parseInt(partOne.trim());

        String partTwo = str.substring(index + 1);
        int partTwoInteger = Integer.parseInt(partTwo.trim());
        int result = 0;

        if (str.charAt(index) == '+') {
            result = (partOneInteger + partTwoInteger);
        } else if ((str.charAt(index) == '-')) {
            result = partOneInteger - partTwoInteger;
        } else if ((str.charAt(index) == '*')) {
            result = partOneInteger * partTwoInteger;
        } else {
            result = partOneInteger / partTwoInteger;
        }
        System.out.println(partOneInteger + " " + str.charAt(index) + " " + partTwoInteger + " = " + result);
    }
}
