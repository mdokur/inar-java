package week_2.assignments;
import java.util.Scanner;
public class Question_02_03 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        double feet = input.nextDouble();
        double meter = (feet * 0.305);
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
