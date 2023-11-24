package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a sequence of numbers ending with '0': ");
        int value = -1;
        while (value != 0) {
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }
        }

        System.out.println("The largest number in the list is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        return java.util.Collections.max(list);
    }
}
