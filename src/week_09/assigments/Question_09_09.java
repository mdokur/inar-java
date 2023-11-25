package week_09.assigments;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("\nFirst regular polygon; " +
                "\nPerimeter is: " + regularPolygon1.getPerimeter() +
                "\nArea is: " + regularPolygon1.getArea());

        System.out.println("\nSecond regular polygon; " +
                "\nPerimeter is: " + regularPolygon2.getPerimeter() +
                "\nArea is: " + regularPolygon2.getArea());

        System.out.println("\nThird regular polygon; " +
                "\nPerimeter is: " + regularPolygon3.getPerimeter() +
                "\nArea is: " + regularPolygon3.getArea());
    }
}
