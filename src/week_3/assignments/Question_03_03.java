package week_3.assignments;

import java.util.*;

public class Question_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double resultOfX;
        double resultOfY;

        double theFormula = (a * d) - (b * c);

        if (theFormula == 0) {
            System.out.println("The equation has no solution");
        } else {
            resultOfX = ((e * d) - (b * f)) / (theFormula);
            resultOfY = ((a * f) - (e * c)) / (theFormula);
            System.out.println("x is " + resultOfX + " and y is " + resultOfY);
        }
    }
}
