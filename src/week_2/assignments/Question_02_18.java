package week_2.assignments;
import java.util.*;
public class Question_02_18 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        int i=1;
        while (i<= a){
            double powAb = Math.pow(a,b);
            System.out.println(a+"   "+b+"   "+(int)powAb);
            --a;
            --b;
            i++;
        }
    }
}
