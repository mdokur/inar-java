package week_2.assignments;
import java.util.Scanner;
public class Question_02_05 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        int subtotal = input.nextInt();
        int gratuityRate = input.nextInt();
        double gratuity = (subtotal * gratuityRate / 100.0);
        double total = (gratuity + subtotal);
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
