package week_09.assigments;

public class Question_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("--Rectangle 1--");
        System.out.println("\nWidth    : " + rectangle1.getWidth()  +
                           "\nHeight   : " + rectangle1.getHeight() +
                           "\nArea     : " + rectangle1.getArea()   +
                           "\nPerimeter: " + rectangle1.getPerimeter());

        System.out.println("--Rectangle 2--");
        System.out.println("\nWidth    : " + rectangle2.getWidth()  +
                "\nHeight   : " + rectangle2.getHeight() +
                "\nArea     : " + rectangle2.getArea()   +
                "\nPerimeter: " + rectangle2.getPerimeter());
    }
}
