package week_05.assignments;
import java.util.Scanner;
public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber=0;
        int count = 1;
        int number;

        System.out.println("Enter integers (it ends with input of 0):");
        do {
           number = input.nextInt();
            if(number>maxNumber) {
                maxNumber = number;
            } else if (number == maxNumber) {
                count++;
            }
        }while(number != 0);
        System.out.printf("The largest count %d and the occurrence of the count is %d",maxNumber,count);
    }
}
