package week_2.assignments;
import java.util.*;
public class Question_02_13 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving and for how long (number of months)");
        double amount = input.nextDouble();
        int months = input.nextInt();
        int i = 1;
        double termin = 0;
        while (i <= months){
            double accountValue = (1 + 0.00417)*(amount + termin);
            termin = accountValue;
            i++;
        }
        System.out.println("After the " + months + " months, the account value is $"+(int)(termin*100)/100.0);
    }
}
