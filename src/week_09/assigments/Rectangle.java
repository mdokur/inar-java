package week_09.assigments;

public class Rectangle {

    private double width;
    private double height;

    Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}
