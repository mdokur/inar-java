package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArray();

        int sumOfList = sumOfList(list);
        System.out.println("The sum of list:" + sumOfList);
    }

    public static ArrayList<Integer> createArray() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        int value;
        for (int i = 0; i < 5; i++) {
            value = input.nextInt();
            list.add(value);
        }
        return list;
    }

    public static int sumOfList(ArrayList<Integer> list) {
        int sumOfList = 0;
        for (int i = 0; i < list.size(); i++) {
            sumOfList += list.get(i);
        }
        return sumOfList;
    }
}
