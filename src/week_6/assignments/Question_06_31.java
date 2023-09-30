package week_6.assignments;
import java.util.Scanner;
public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit number as long a integer: ");
        long creditCardNumber = input.nextLong();
        System.out.println((isValidCardNumber(creditCardNumber)) ? "valid" : "invalid");
    }

    public static boolean isValidCardNumber(long creditNumber) {
        boolean result = true;
        if (!isValidLength(creditNumber)) {
            result = false;
        }
        if (!isValidStart(creditNumber)) {
            result = false;
        }

        int sumOfDoublePlaces = sumOddPlace(creditNumber) + sumOfDoubleEvenPlace(creditNumber);
        if (sumOfDoublePlaces % 10 != 0) {
            result = false;
        }
        return result;
    }

    public static boolean isValidLength(long creditNumber) {
        String cardCreditNumber = creditNumber + "";
        return cardCreditNumber.length() >= 13 && cardCreditNumber.length() <= 16;
    }

    public static boolean isValidStart(long creditNumber) {
        String cardCreditNumber = creditNumber + "";
        if (cardCreditNumber.charAt(0) == '4'
                || cardCreditNumber.charAt(0) == '5'
                || cardCreditNumber.charAt(0) == '6'
                || cardCreditNumber.startsWith("37")) {
            return true;
        }
        return false;
    }

    public static int sumOddPlace(long creditNumber) {
        String cardCreditNumber = creditNumber + "";
        int sum = 0;
        for (int i = (cardCreditNumber.length() - 1); i >= 0; i -= 2) {
            sum += (cardCreditNumber.charAt(i) - '0');
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long creditNumber) {
        String cardCreditNumber = creditNumber + "";
        int str = 0;
        int sum = 0;
        for (int i = (cardCreditNumber.length() - 2); i >= 0; i -= 2) {
            str = (cardCreditNumber.charAt(i) - '0');
            str *= 2;

            sum += getDigit(str);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number > 9) {
            return number % 10 + number / 10;
        }
        return number;
    }
}
