package week_02.assignments;

import java.util.*;

public class Question_02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), (double) 1 / 2);
        System.out.println("The distance between the two points is " + distance);
    }
}