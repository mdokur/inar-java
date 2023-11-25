package week_04.assignments;

import java.util.*;

public class Question_04_02 {
    public static void main(String[] args) {
        final double AVERAGE_EARTH_RADIUS = 6_371.01;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
        double latitudePoint1Degree = input.nextDouble();
        double longitudePoint1Degree = input.nextDouble();
        double latitudePoint1Radian = Math.toRadians(latitudePoint1Degree);
        double longitudePoint1Radian = Math.toRadians(longitudePoint1Degree);

        System.out.print("Enter point 2 (latitude and longtitude) in degrees : ");
        double latitudePoint2Degree = input.nextDouble();
        double longitudePoint2Degree = input.nextDouble();
        double latitudePoint2Radian = Math.toRadians(latitudePoint2Degree);
        double longitudePoint2Radian = Math.toRadians(longitudePoint2Degree);

        double greatCircleDistance = AVERAGE_EARTH_RADIUS
                * Math.acos(Math.sin(latitudePoint1Radian)
                * Math.sin(latitudePoint2Radian)
                + Math.cos(latitudePoint1Radian)
                * Math.cos(latitudePoint2Radian)
                * Math.cos(longitudePoint1Radian - longitudePoint2Radian));

        System.out.println("The distance between the two points is " + greatCircleDistance + "km");
    }
}
