package week_5.assignments;

public class Question_05_11 {
    public static void main(String[] args) {
        int count = 0;

        for (int number = 100; number <= 200; number++) {
            if (number % 5 == 0 ^ number % 6 == 0) {
                System.out.print(" " + number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
