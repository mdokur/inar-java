package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of points: ");
        int sizeOfArrayLists = input.nextInt();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < sizeOfArrayLists * 2; i++) {
            double value = input.nextDouble();
            if (i % 2 != 0) {
                list2.add(value);
            } else {
                list1.add(value);
            }
        }

        System.out.println("The total area is " + total(list1, list2));
    }

    public static double total(ArrayList<Double> list1, ArrayList<Double> list2) {
        //Formula of Shoelace
        double sum1 = 0;
        for (int i = list1.size() - 1; i > 0; i--) {
            sum1 += (list1.get(i) * list2.get(i - 1));
        }
        sum1 += (list2.get(list1.size() - 1) * list1.get(0));

        double sum2 = 0;
        for (int i = list2.size() - 1; i > 0; i--) {
            sum2 += (list2.get(i) * list1.get(i - 1));
        }
        sum2 += (list1.get(list1.size() - 1) * list2.get(0));

        return 0.5 * (sum1 - sum2);
    }
}
