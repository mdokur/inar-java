package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        displayClosestPoint(points);
    }

    public static void displayClosestPoint(double[][] matrix) {
        int p1 = 0;
        int p2 = 1;
        double minDistance = distance(matrix[p1][0], matrix[p1][1], matrix[p1][2],
                matrix[p2][0], matrix[p2][1], matrix[p2][2]);

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                double distance = distance(matrix[i][0], matrix[i][1], matrix[i][2],
                        matrix[j][0], matrix[j][1], matrix[j][2]);
                if (distance < minDistance) {
                    p1 = i;
                    p2 = j;

                    minDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " +
                "(" + matrix[p1][0] + ", " + matrix[p1][1] + ", " + matrix[p1][2] + ") and (" +
                matrix[p2][0] + ", " + matrix[p2][1] + ", " + matrix[p2][2] + ")");
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }
}