package week_3.assignments;

import java.util.*;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double coordinateX = input.nextDouble();
        double coordinateY = input.nextDouble();
        double distance = Math.pow(Math.pow((coordinateX - 0), 2) + Math.pow((coordinateY - 0), 2), 0.5);

        if (distance > 10) {
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is not in the circle");
        } else System.out.println("Point (" + coordinateX + "," + coordinateY + ") is  in the circle");
    }
}
