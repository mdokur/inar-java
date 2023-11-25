package week_06.assignments;

import java.util.*;

import static java.lang.Math.abs;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides for a triangle: ");
        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double thirdSide = input.nextDouble();

        isValid(firstSide, secondSide, thirdSide);
    }

    public static void isValid(double side1, double side2, double side3) {
        if ((Math.abs(side3 - side2) < side1 && side1 < side3 + side2)
                && Math.abs(side1 - side3) < side2 && side2 < side1 + side3
                && Math.abs(side1 - side2) < side3 && side3 < side1 + side2) {

            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid input! This is not a triangle!");
        }
    }

    public static double area(double side1, double side2, double side3) {
        double hpt = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(hpt * (hpt - side1) * (hpt - side2) * (hpt - side3));

        return area;
    }
}
