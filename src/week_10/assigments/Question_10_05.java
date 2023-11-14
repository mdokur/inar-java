package week_10.assigments;
import java.util.Scanner;
public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        System.out.print("Enter a positive integer: ");
        int integer = input.nextInt();
        System.out.println("Increasing order: ");

        int number =2;

        while(number<=integer){
            if(integer%number == 0){
                stackOfIntegers.push(number);
                System.out.print(number+" ");
                integer = integer/number;

            }else{
                number++;
            }

        }


        System.out.println("\nWe used pop() method(Decreasing order):");

        while (!stackOfIntegers.isEmpty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
