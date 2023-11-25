package week_04.assignments;
import java.util.Scanner;
public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in dollars and cents : ");
        String stringOfValue = input.nextLine();

        int indexOfPoint = stringOfValue.indexOf(',');
        String firstPartOfValue = stringOfValue.substring(0, indexOfPoint);
        String secondPartOfValue = stringOfValue.substring(indexOfPoint + 1);
        stringOfValue = firstPartOfValue.concat(secondPartOfValue);
        int value = Integer.parseInt(stringOfValue, 10);

        int remainingValue;
        int dollars = value / 100;
        remainingValue = value % 100;

        int quarters = remainingValue / 25;
        remainingValue = remainingValue % 25;

        int dimes = remainingValue / 10;
        remainingValue = remainingValue % 10;

        int nickels = remainingValue / 5;
        remainingValue = remainingValue % 5;

        int pennies = remainingValue;

        System.out.printf("""
                Equivalent in Monetary Units :
                Dollars : %d
                Quarters : %d
                Dimes : %d
                Nickels : %d
                Pennies : %d""", dollars, quarters, dimes, nickels, pennies);
    }
}
