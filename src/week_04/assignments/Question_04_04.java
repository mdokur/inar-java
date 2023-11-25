package week_04.assignments;

import java.util.*;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double sideOfHexagon = input.nextDouble();

        double area = (6 * Math.pow(sideOfHexagon, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %4.2f", area);
    }
}
