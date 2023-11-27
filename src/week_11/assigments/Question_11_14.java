package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        System.out.println("Enter five integers for list1");
        ArrayList<Integer> list1 = createArray();
        System.out.println("Enter five integers for list2");
        ArrayList<Integer> list2 = createArray();

        displayUnionArray(list1, list2);
    }

    public static ArrayList<Integer> createArray() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int value;
        for (int i = 0; i < 5; i++) {
            value = input.nextInt();
            list.add(value);
        }
        return list;
    }

    public static void displayUnionArray(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            unionList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            unionList.add(list2.get(i));
        }

        System.out.print("The combined list is ");
        for (int i = 0; i < unionList.size(); i++) {
            System.out.print(unionList.get(i) + " ");
        }
    }
}
