package week_10.assigments;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10.0, 30.5);

        System.out.println("The distance between (" + myPoint.getX() + "," + myPoint.getY() + ") and (" +
                myPoint1.getX() + "," + myPoint1.getY() + ") is: " + myPoint.distance(myPoint1));
        System.out.println(myPoint.distance(10, 30.5));
    }
}
