package week_2.assignments;
import java.util.*;
public class Question_02_14 {
    public static void main(String [] args){
        final double poundToKilogram = 0.45359237;
        final double inchToMeter = 0.0254;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double pounds = input.nextDouble();
        double kilogram = (poundToKilogram*pounds);

        System.out.println("Enter your height in inches:");
        double inch = input.nextDouble();
        double meter = (inch*inchToMeter);

        double bmi = kilogram / Math.pow(meter, 2);
        System.out.println("BMI is "+(int)(bmi*10000)/10000.0);
    }
}
