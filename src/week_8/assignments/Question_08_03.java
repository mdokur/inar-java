package week_8.assignments;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] studentAnswers = createMatrix();
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] resultOfStudents = correctAnswersCheck(studentAnswers, keys);
        sortTheArray(resultOfStudents);
        // displayArray(resultOfStudents);
    }

    public static char[][] createMatrix() {
        char[][] matrix = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        return matrix;
    }

    public static int[][] correctAnswersCheck(char[][] answers, char[] keys) {
        int[][] result = new int[8][1];
        for (int i = 0; i < answers.length; i++) {
            int correctPoint = 0;
            for (int j = 0; j < answers[0].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctPoint++;
                }
            }
            result[i][0] = correctPoint;
        }
        return result;
    }

    public static void sortTheArray(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                int temp = matrix[i][j];

            }
        }
    }
}
