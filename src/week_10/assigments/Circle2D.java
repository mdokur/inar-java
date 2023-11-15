package week_10.assigments;

public class Circle2D {
    private double x;
    private double y;
    private double radius;


    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getRadius() {
        return radius;
    }

    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - getX(), 2) + (Math.pow(y - getY(), 2)));

        if (distance < radius) {
            return true;
        }
        return false;
    }

    public boolean contains(Circle2D circle2D) {
        double distance = Math.sqrt(Math.pow(circle2D.getX() - this.x, 2) + (Math.pow(circle2D.getY() - this.y, 2)));

        if (distance <= Math.abs(circle2D.getRadius()) - this.radius) {
            return true;
        }
        return false;
    }

    public boolean overlaps(Circle2D circle2D) {
        double distance = Math.sqrt(Math.pow(circle2D.getX() - this.x, 2) + (Math.pow(circle2D.getY() - this.y, 2)));

        if (distance <= (circle2D.getRadius()) + this.radius) {
            return true;
        }
        return false;
    }
}
