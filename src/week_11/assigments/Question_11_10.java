package week_11.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();

        System.out.println("Stack: " + list.toString());
        System.out.println("Displaying them in reverse order...");
        sortArrayList(list);
        System.out.println("New Stack: " + list.toString());
    }

    public static ArrayList<Integer> createArrayList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with '0': ");
        int value = -1;
        while (value != 0) {
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }
        }
        return list;
    }

    public static void sortArrayList(ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }
}
