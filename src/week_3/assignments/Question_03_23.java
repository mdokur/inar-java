package week_3.assignments;

import java.sql.SQLOutput;
import java.util.*;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double coordinateX = input.nextDouble();
        double coordinateY = input.nextDouble();

        if ((Math.abs(coordinateY) > 5.0 / 2.0) || (Math.abs(coordinateX) > 5.0)) {
            System.out.println("The point (" + coordinateX + ", " + coordinateY + ") is not in the rectangle.");
        } else
            System.out.println("The point (" + coordinateX + "," + coordinateY + ") is in the rectangle.");
    }
}
