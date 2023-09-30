package week_6.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        palindromicPrime(100);
    }

    public static void palindromicPrime(int numberOfPalindromicPrime) {
        int count = 0;
        for (int i = 10; count < numberOfPalindromicPrime; i++) {

            if ((isPrime(i) && (isPrime(reverse(i)))) && (!isPalindromic(i))) {
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

    public static int reverse(int number) {
        String numberNew = number + "";
        String output = "";
        for (int i = numberNew.length() - 1; i >= 0; i--) {
            output += numberNew.charAt(i);
        }
        return Integer.parseInt(output);
    }
}
