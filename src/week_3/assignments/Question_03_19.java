package week_3.assignments;

import java.util.*;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");
        double firstEdge = input.nextDouble();
        double secondEdge = input.nextDouble();
        double thirdEdge = input.nextDouble();

        if ((firstEdge + secondEdge) < thirdEdge
                || (firstEdge + thirdEdge) < secondEdge
                || (secondEdge + thirdEdge) < firstEdge) {
            System.out.println("The input is invalid.");
        } else {
            double perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println("The perimeter is " + perimeter);
        }
    }
}
