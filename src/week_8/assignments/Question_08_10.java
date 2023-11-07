package week_8.assignments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4, 4);
        displayMatrix(matrix);
        findLargestRowIndex(matrix);
        findLargestColumnIndex(matrix);
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("The matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void findLargestRowIndex(int[][] matrix) {
        int max = 0;
        int sumOfRow = 0;
        int rowNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumOfRow += matrix[i][j];
            }
            if (sumOfRow > max) {
                max = sumOfRow;
                rowNumber = i;
            }
            sumOfRow = 0;
        }
        System.out.println("The largest row index: " + rowNumber);
    }

    public static void findLargestColumnIndex(int[][] matrix) {
        int max = 0;
        int sumOfColumn = 0;
        int columnNumber = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumOfColumn += matrix[j][i];
            }
            if (sumOfColumn > max) {
                max = sumOfColumn;
                columnNumber = i;
            }
            sumOfColumn = 0;
        }
        System.out.println("The largest column index: " + columnNumber);
    }
}
