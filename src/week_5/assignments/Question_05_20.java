package week_5.assignments;

public class Question_05_20 {
    public static void main(String[] args) {
        int number = 2;
        int numberCount = 0;

        while (2 <= number && number <= 1000) {
            boolean isPrime = true;
            for (int number1 = 2; number1 <= number / 2; number1++)
                if (number % number1 == 0) {
                    isPrime = false;
                    break;
                }

            if (isPrime) {
                numberCount++;
                System.out.print(" " + number);
                if (numberCount % 8 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}
