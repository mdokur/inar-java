package week_09.assigments;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.displayRoots();
    }
}
