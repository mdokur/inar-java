package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {

        int[] primeNumbers = new int[50];
        int count = 1;
        int number = 3;
        primeNumbers[0] = 2;
        while (count < 50) {
            if (isPrime(primeNumbers, number)) {
                primeNumbers[count++] = number;
            }
            number++;
        }
        displayArray(primeNumbers);
    }

    public static boolean isPrime(int[] array, int number) {
        int index = 0;
        while (Math.sqrt(number) >= array[index]) {
            if (number % array[index] == 0) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static void displayArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%3d ", number[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
