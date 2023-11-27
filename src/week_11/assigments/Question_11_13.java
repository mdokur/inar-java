package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArray();
        removeDuplicateAndDisplay(list);
    }

    public static ArrayList<Integer> createArray() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter ten integers: ");
        int value;
        for (int i = 0; i < 10; i++) {
            value = input.nextInt();
            list.add(value);
        }
        return list;
    }

    public static void removeDuplicateAndDisplay(ArrayList<Integer> list) {
        ArrayList<Integer> withoutDuplicateList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!withoutDuplicateList.contains(list.get(i))) {
                withoutDuplicateList.add(list.get(i));
            }
        }
        System.out.print("The distinct integers are ");
        for (int i = 0; i < withoutDuplicateList.size(); i++) {
            System.out.print(withoutDuplicateList.get(i) + " ");
        }
    }
}
