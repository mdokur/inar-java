package week_2.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int year = input.nextInt();
        final int totalSecound = 31556926;
        final int currentPopulation = 312032486;
        int birthYear = (totalSecound / 7);
        int deathYear = (totalSecound / 13);
        int newImmigrant = (totalSecound / 45);
        int newCurrentPopulation = (((birthYear + newImmigrant - deathYear) * year) + currentPopulation);
        System.out.println("The population in " + year + " years is " + newCurrentPopulation);
    }
}
