package week_6.assignments;

import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many questions are there in total? ");
        int questionNumber = input.nextInt();

        System.out.print("\nThe person who will solve the question -> ");

        randomPerson();
        System.out.printf("The question to be solved is -> %d\n\n\n",

                randomQuestion(questionNumber));
    }

    public static void randomPerson() {
        int number = (int) (Math.random() * 6);
        switch (number) {
            case 0 -> System.out.println("Ada");
            case 1 -> System.out.println("Merve");
            case 2 -> System.out.println("Emir");
            case 3 -> System.out.println("Celalettin");
            case 4 -> System.out.println("Musa");
        }
    }

    public static int randomQuestion(int questionNumber) {
        return (int) (Math.random() * questionNumber + 1);
    }
}


