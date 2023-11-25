package week_05.assignments;
import java.util.Scanner;
public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount (e.g., 100): ");
        double amount = input.nextInt();
        System.out.println("Enter the annual interest rate (e.g., 5): ");
        double annualRate = input.nextInt();
        System.out.println("Enter the number of months (e.g., 6): ");
        int numberOfMonths = input.nextInt();

        double monthlyRate =(double) annualRate/100/12;
        double totalAmount=0;

        for (int i = 1; i <=numberOfMonths ; i++) {
            totalAmount = (amount+totalAmount)*(1+monthlyRate);
        }
        System.out.printf("Amount in savings account after %d months: $%.2f", numberOfMonths, totalAmount);
    }
}
