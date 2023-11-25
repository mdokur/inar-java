package week_03.assignments;

import java.util.*;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, and c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (Math.pow(b, 2)) - (4 * a * c);
        double root1;
        double root2;

        if (discriminant > 0) {
            root1 = (((-1) * b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            root2 = (((-1) * b) - (Math.pow(discriminant, 0.5))) / (2 * a);
            System.out.println("The equation has two roots " +
                    (float) root1 + " and " + (float) root2);
        } else if (discriminant == 0) {
            root1 = (((-1) * b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
