package week_11.assigments;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }

    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        String display = "Triangle: Side1: " + side1 + " Side2: " + side2 + " Side3: " + side3;
        return display;
    }
}

