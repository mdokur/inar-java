package week_3.assignments;

import java.util.*;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle's center x-,y-coordinates and radius : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radiusOfCircle1 = input.nextDouble();

        System.out.print("Enter circle2 center x- y- coordinates and radius : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radiusOfCircle2 = input.nextDouble();
        double distanceBetweenCenterOfTwoCircle = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanceBetweenCenterOfTwoCircle + radiusOfCircle2 < radiusOfCircle1) {
            System.out.println("circle 2 is inside circle 1");
        } else if (distanceBetweenCenterOfTwoCircle > radiusOfCircle1 + radiusOfCircle2) {
            System.out.println("circle 2 does not overlap circle 1");
        } else
            System.out.println("circle 2 overlaps circle 1");
    }
}
