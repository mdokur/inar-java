package week_11.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList();

        System.out.println("The array before sorting:\n" + list.toString());

        System.out.println("The array after manuel sorting:");
        manuelSort(list);
        System.out.println(list.toString());

        System.out.println("The array after java sorting:");
        Collections.sort(list);
        System.out.println(list.toString());
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

    public static void manuelSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.remove(minIndex);
            list.add(i, list.get(i));
            list.remove(i);
            list.add(i, min);
        }
    }
}
