package week_3.assignments;

import java.util.*;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point's x- and y- coordinates: ");
        double coordinateX = input.nextDouble();
        double coordinateY = input.nextDouble();

        if ((0 < coordinateX && coordinateX < 200) && (0 < coordinateY && coordinateY < 100)) {
            if ((coordinateX <= 100 && coordinateY <= 50)
                    || (coordinateX > 100 && coordinateY < 50)
                    || (coordinateX < 100 && coordinateY > 50)) {
                System.out.println(" The point is in the triangle");
            } else {
                System.out.println(" The point is not in the triangle");
            }

        }else {
            System.out.println(" The point is not in the triangle");
        }
    }
}
