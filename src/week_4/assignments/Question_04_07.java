package week_4.assignments;

import java.util.*;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle : ");
        double radius = input.nextDouble();

        double x1 = radius * Math.cos(Math.toRadians(90 - 72 - 72));
        double y1 = radius * Math.sin(Math.toRadians(90 - 72 - 72));

        double x2 = radius * Math.cos(Math.toRadians(90 - 72));
        double y2 = radius * Math.sin(Math.toRadians(90 - 72));

        double x3 = radius * Math.cos(Math.toRadians(90));
        double y3 = radius * Math.sin(Math.toRadians(90));

        double x4 = radius * Math.cos(Math.toRadians(90 + 72));
        double y4 = radius * Math.sin(Math.toRadians(90 + 72));

        double x5 = radius * Math.cos(Math.toRadians(90 + 72 + 72));
        double y5 = radius * Math.sin(Math.toRadians(90 + 72 + 72));


        System.out.printf("The coordinates of five points on the pentagon are \n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%d,%d)\n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%6.4f,%6.4f)"
                , x1, y1, (int) x2, (int) y2, x3, y3, x4, y4, x5, y5);
    }
}
