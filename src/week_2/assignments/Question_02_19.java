package week_2.assignments;
import java.util.*;
public class Question_02_19 {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double area = (0.5 * Math.abs((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3)));
        System.out.println("The area of the triangle is "+(int)(area*10)/10.0);
    }
}
