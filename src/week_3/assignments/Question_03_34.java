package week_3.assignments;

import java.util.*;

public class Question_03_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if (x1 < x0) {
            double temp = x1;
            x1 = x2;
            x2 = temp;
            double temp2 = y1;
            y1 = y2;
            y2 = temp2;
        }
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (position == 0) {
            if (x2 < x1 && x2 > x0) {
                System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" +
                        x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
            } else System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" +
                    x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
