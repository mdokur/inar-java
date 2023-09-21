package week_6.assignments;

public class Question_06_12 {
    public static void main(String[] args) {
        System.out.println("Characters per '1' to 'Z':\n");
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int k = 0;
        for (int i = '1'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
            k++;
            if (k % 10 == 0) {
                System.out.println();
            }
        }
    }
}
