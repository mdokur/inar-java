package week_04.assignments;

import java.util.*;

public class Question_04_06 {
    public static void main(String[] args) {
        double angle1 = (Math.random() * Math.PI) * 2;
        double angle2 = (Math.random() * Math.PI) * 2;
        double angle3 = (Math.random() * Math.PI) * 2;

        double x1 = 40 * Math.cos(angle1);
        double y1 = 40 * Math.sin(angle1);

        double x2 = 40 * Math.cos(angle2);
        double y2 = 40 * Math.sin(angle2);

        double x3 = 40 * Math.cos(angle3);
        double y3 = 40 * Math.sin(angle3);

        double sideABetweenPoint1AndPoint2 = Math.sqrt(Math.pow(x1 - x2, 2)
                + Math.pow(y1 - y2, 2));
        double sideBBetweenPoint2AndPoint3 = Math.sqrt(Math.pow(x2 - x3, 2)
                + Math.pow(y2 - y3, 2));
        double sideCBetweenPoint1AndPoint3 = Math.sqrt(Math.pow(x1 - x3, 2)
                + Math.pow(y1 - y3, 2));

        double angleA = Math.acos((sideABetweenPoint1AndPoint2 * sideABetweenPoint1AndPoint2
                - sideBBetweenPoint2AndPoint3 * sideBBetweenPoint2AndPoint3
                - sideCBetweenPoint1AndPoint3 * sideCBetweenPoint1AndPoint3)
                / (-2 * sideBBetweenPoint2AndPoint3 * sideCBetweenPoint1AndPoint3));

        double angleB = Math.acos((sideBBetweenPoint2AndPoint3 * sideBBetweenPoint2AndPoint3
                - sideABetweenPoint1AndPoint2 * sideABetweenPoint1AndPoint2
                - sideCBetweenPoint1AndPoint3 * sideCBetweenPoint1AndPoint3)
                / (-2 * sideABetweenPoint1AndPoint2 * sideCBetweenPoint1AndPoint3));

        double angleC = Math.acos((sideCBetweenPoint1AndPoint3 * sideCBetweenPoint1AndPoint3
                - sideBBetweenPoint2AndPoint3 * sideBBetweenPoint2AndPoint3
                - sideABetweenPoint1AndPoint2 * sideABetweenPoint1AndPoint2)
                / (-2 * sideABetweenPoint1AndPoint2 * sideBBetweenPoint2AndPoint3));

        System.out.printf("The three angles are : %5.2f  %5.2f  %5.2f", Math.toDegrees(angleA), Math.toDegrees(angleB), Math.toDegrees(angleC));
    }
}
