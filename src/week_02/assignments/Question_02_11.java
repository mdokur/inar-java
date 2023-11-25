package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TOTAL_SECOND = 31556926;
        final int CURRENT_POPULATION = 312032486;

        System.out.println("Enter the number of years: ");
        int year = input.nextInt();
        int birthYear = (TOTAL_SECOND / 7);
        int deathYear = (TOTAL_SECOND / 13);
        int newImmigrant = (TOTAL_SECOND / 45);

        int newCurrentPopulation = (((birthYear + newImmigrant - deathYear) * year) + CURRENT_POPULATION);
        System.out.println("The population in " + year + " years is " + newCurrentPopulation);
    }
}
