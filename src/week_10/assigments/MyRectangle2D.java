package week_10.assigments;

public class MyRectangle2D {
    private double x;
    private double y;
    private double height;
    private double weight;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = this.x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = this.y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = this.height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = this.weight;
    }

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.weight = 1;
        this.height = 1;
    }

    MyRectangle2D(double x, double y, double weight, double height) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
    }

    public double getArea() {
        return weight * height;
    }

    public double getPerimeter() {
        return 2 * (weight + height);
    }

    public boolean contains(double x, double y) {
        if ((x > this.x - weight / 2 && x < this.x + weight / 2) &&
                (y > this.y - weight / 2 && y < this.y + weight / 2)) {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D rectangle) {
        if ((Math.abs(rectangle.getX() - this.x) <= this.weight / 2) && (Math.abs(rectangle.getY() - this.getY()) <= height / 2) &&
                (((rectangle.getWeight() < this.weight)
                        || (rectangle.getWeight() < this.height)) && ((rectangle.getHeight() < this.height) || (rectangle.getHeight() < this.weight)))) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D rectangle) {
        if ((rectangle.getX() - rectangle.getWeight() / 2 > this.getX() + this.getWeight() / 2)
                || (rectangle.getX() + rectangle.getWeight() / 2 < this.getX() - this.getWeight() / 2)
                || (this.getY() + this.getHeight() / 2 < rectangle.getY() - rectangle.getHeight() / 2)
                || (this.getY() - this.getHeight() / 2 > rectangle.getY() + rectangle.getHeight() / 2)) {
            return false;

        }
        return true;
    }

    public static MyRectangle2D getRectangle(double[][] matrix) {
        double x1 = getMinX(matrix);
        double x2 = getMaxX(matrix);
        double y1 = getMinY(matrix);
        double y2 = getMaxY(matrix);
        double weight = findWeight(x1, x2);
        double height = findHeight(y1, y2);
        double x = findX(x1, x2, weight);
        double y = findY(y1, y2, height);

        MyRectangle2D myRectangle2D = new MyRectangle2D(x, y, weight, height);
        return myRectangle2D;
    }

    public static double getMinX(double[][] matrix) {
        double min = matrix[0][0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
        }
        return min;
    }

    public static double getMaxX(double[][] matrix) {
        double max = matrix[0][0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] > max) {
                max = matrix[i][0];
            }
        }
        return max;
    }

    public static double getMinY(double[][] matrix) {
        double min = matrix[0][1];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][1] < min) {
                min = matrix[i][1];
            }
        }
        return min;
    }

    public static double getMaxY(double[][] matrix) {
        double max = matrix[0][1];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][1] > max) {
                max = matrix[i][1];
            }
        }
        return max;
    }

    public static double findWeight(double minX, double maxX) {
        if ((minX > 0 && maxX > 0) || (minX < 0 && maxX > 0)) {
            return maxX - minX;
        } else {
            return Math.abs(maxX - minX);
        }
    }

    public static double findHeight(double minY, double maxY) {
        if ((minY > 0 && maxY > 0) || (minY < 0 && maxY > 0)) {
            return maxY - minY;
        } else {
            return Math.abs(maxY - minY);
        }
    }

    public static double findX(double minX, double maxX, double weight) {
        if (minX > 0 && maxX > 0) {
            return weight / 2 + minX;
        } else if (minX < 0 && maxX > 0) {
            return maxX - weight / 2;
        } else {
            return maxX - weight / 2;
        }
    }

    public static double findY(double minY, double maxY, double height) {
        if (minY > 0 && maxY > 0) {
            return height / 2 + minY;
        } else if (minY < 0 && maxY > 0) {
            return maxY - height / 2;
        } else {
            return maxY - height / 2;
        }
    }
}
