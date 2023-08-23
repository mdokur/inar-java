package week_3.assignments;

import java.util.*;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUND_TO_KG = 0.45359237;
        final double FEET_TO_METER = 0.3048;
        final double INCH_TO_METER = 0.0254;

        System.out.print("Enter weight in pounds : ");
        double weightInPound = input.nextDouble();
        System.out.print("Enter feet : ");
        double heightInFeet = input.nextDouble();
        System.out.print("Enter inches : ");
        double heightInInch = input.nextDouble();

        double weightInKilogram = weightInPound * POUND_TO_KG;
        double heightInMeter = (heightInFeet * FEET_TO_METER) + (heightInInch * INCH_TO_METER);
        double bodyMassIndex = weightInKilogram / (Math.pow(heightInMeter, 2));
        System.out.println("Your BMI is " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 25) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
