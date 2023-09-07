package week_5.assignments;
import java.util.Scanner;
public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1;
        int greatDivisor=1;

        System.out.println("Enter the first integer: ");
        int firstDigit = input.nextInt();
        System.out.println("Enter the second integer: ");
        int secondDigit = input.nextInt();

       while(firstDigit%i==0 && secondDigit%i==0){
           greatDivisor*=i;
           i++;
       }
        System.out.println(greatDivisor);
    }
}
