package week_02.assignments;

import java.util.*;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance in miles:");
        double drivingDistance = input.nextDouble();
        System.out.println("Enter miles per a gallon:");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon:");
        double pricePerGallon = input.nextDouble();

        double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is $" + (int) (costOfDriving * 100) / 100.0);
    }
}
