package week_2.assignments;

import java.util.*;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUND_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;


        System.out.println("Enter your weight in pounds:");
        double pounds = input.nextDouble();
        double kilogram = (POUND_TO_KG * pounds);

        System.out.println("Enter your height in inches:");
        double inch = input.nextDouble();
        double meter = (inch * INCH_TO_METER);

        double bmi = kilogram / Math.pow(meter, 2);
        System.out.println("BMI is " + (int) (bmi * 10000) / 10000.0);
    }
}
