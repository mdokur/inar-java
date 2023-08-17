package week_2.assignments;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double celsius1 = input.nextDouble();
        double fahrenheit1 = (9.0/5.0) * celsius1 + 32;
        System.out.println(celsius1 + " Celsius is " + fahrenheit1 + " Fahrenheit");

    }
}
