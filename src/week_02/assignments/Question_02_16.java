package week_02.assignments;

import java.util.*;

public class Question_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a side of the hexagon:");
        double side = input.nextDouble();
        double area = (Math.pow(3, (double) 1 / 2) * 3 * Math.pow(side, (double) 2)) / 2;
        System.out.println("The area of the hexagon is " + (int) (area * 10000) / 10000.0);
    }
}
