package week_12.assigments;

import java.util.Scanner;

public class Question_12_01 {
    public static void main(String[] args) {
        //this program can calculate for the input numbers
        String[] array = createArray();
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " = " + result(array));
    }

    public static String[] createArray() {

        Scanner input = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next();
        }

        try {
            int number1 = Integer.parseInt(array[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + array[0]);
            System.exit(1);
        }
        try {
            int number2 = Integer.parseInt(array[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + array[2]);
            System.exit(2);
        }
        return array;
    }

    public static int result(String[] array) {
        int result = 0;
        switch (array[1].charAt(0)) {
            case '+':
                result = (Integer.parseInt(array[0]) + Integer.parseInt(array[2]));
                break;
            case '-':
                result = (Integer.parseInt(array[0]) - Integer.parseInt(array[2]));
                break;
            case '*':
                result = (Integer.parseInt(array[0]) * Integer.parseInt(array[2]));
                break;
            case '/':
                result = (Integer.parseInt(array[0]) / Integer.parseInt(array[2]));
                break;
        }
        return result;
    }
}
