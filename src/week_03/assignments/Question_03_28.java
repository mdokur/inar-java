package week_03.assignments;

import java.util.*;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-,y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();
        double distanceOfR1R2 = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        if ((distanceOfR1R2 < r1Width / 2) || (distanceOfR1R2 < r1Height / 2)) {
            System.out.println("r2 is inside r1");
        } else if (distanceOfR1R2 < ((r1Width + r2Width) / 2) || (distanceOfR1R2 < (r1Height + r2Height))) {
            System.out.println("r2 overlaps r1");
        } else
            System.out.println("r2 does not overlap r1");
    }
}
