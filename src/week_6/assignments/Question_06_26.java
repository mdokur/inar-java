package week_6.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        palindromicPrime(100);
    }

    public static void palindromicPrime(int numberOfPalindromicPrime) {
        int count = 0;
        for (int i = 2; count < numberOfPalindromicPrime; i++) {
            if (isPrime(i) && isPalindromic(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromic(int number) {
        String str = number + "";
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        if (str.compareTo(output) != 0) {
            return false;
        }
        return true;
    }
}
