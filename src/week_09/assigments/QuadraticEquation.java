package week_09.assigments;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {
            return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        } else {
            return 0;
        }
    }

    public void displayRoots() {
        if (getRoot1() != 0 && getRoot2() != 0) {
            System.out.println("The equation has two  roots " + getRoot1() + " and " + getRoot2());
        } else if (getRoot1() != 0 && getRoot2() == 0) {
            System.out.println("The equation has one root " + getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
