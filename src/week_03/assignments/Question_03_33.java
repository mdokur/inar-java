package week_03.assignments;

import java.util.*;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1 :");
        double weightOfPackage1 = input.nextDouble();
        double priceForPackage1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2 :");
        double weightOfPackage2 = input.nextDouble();
        double priceForPackage2 = input.nextDouble();


        double pricePerPackage1 = weightOfPackage1 / priceForPackage1;
        double pricePerPackage2 = weightOfPackage2 / priceForPackage2;

        if (pricePerPackage1 > pricePerPackage2) {
            System.out.println("Package 1 has a better price.");

        } else if (pricePerPackage2 > pricePerPackage1) {
            System.out.println("Package 2 has a better price.");

        } else System.out.println("Two package have the same price.");
    }
}
