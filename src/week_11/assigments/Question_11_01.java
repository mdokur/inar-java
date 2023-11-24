package week_11.assigments;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color: ");
        String color = input.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Is the triangle filled (true/ false)?");
        String answer = input.next();
        if (answer.equals("true")) {
            triangle.setEmpty(true);
        } else {
            triangle.setEmpty(false);
        }

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());

        if (triangle.isEmpty) {
            System.out.println("Triangle is filled.");
        } else {
            System.out.println("Triangle is not filled.");
        }
    }
}
