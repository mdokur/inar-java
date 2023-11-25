package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 10);
            randomNumbers[randomNumber]++;
        }
        System.out.println("Count for each number between 0 and 9:");
        printRandomNumbersArray(randomNumbers);
    }

    public static void printRandomNumbersArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "s: " + array[i]);
        }
    }
}
