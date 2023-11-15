package week_10.assigments;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D rectangle = MyRectangle2D.getRectangle(points);
        System.out.println("The bounding rectangle's center (" + rectangle.getX() + "," + rectangle.getY() + "), width "
                + rectangle.getWeight() + " height is " + rectangle.getHeight());
    }
}
