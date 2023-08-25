package week_3.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the wight of the package (in pounds) :  ");
        double weight = input.nextDouble();
        double cost = 0;

        if (0 < weight && weight <= 1) {
            cost = weight * 3.5;
        } else if (1 < weight && weight <= 3) {
            cost = weight * 5.5;
        } else if (3 < weight && weight <= 10) {
            cost = weight * 8.5;
        } else if (10 < weight && weight <= 20) {
            cost = weight * 10.5;
        } else {
            System.out.println("The package cannot be shipped.");
            System.exit(1);
        }
        System.out.println("Shipping cost of package is $" + (int) (cost * 100) / 100.0);
    }
}

