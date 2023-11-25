package week_04.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");
        String firstCity = input.nextLine();
        char chOfFirstCity = firstCity.charAt(0);
        int integerChOfFirstCity = chOfFirstCity;

        System.out.print("Enter the first city : ");
        String secondCity = input.nextLine();
        char chOfSecondCity = secondCity.charAt(0);
        int integerChOfScondCity = chOfSecondCity;

        System.out.print("Enter the first city : ");
        String thirdCity = input.nextLine();
        char chOfThirdCity = thirdCity.charAt(0);
        int integerChOfThirdCity = chOfThirdCity;

        if (integerChOfFirstCity < integerChOfScondCity
                && integerChOfFirstCity < integerChOfThirdCity
                && integerChOfScondCity < integerChOfThirdCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", firstCity, secondCity, thirdCity);
        } else if (integerChOfFirstCity < integerChOfScondCity
                && integerChOfFirstCity < integerChOfThirdCity
                && integerChOfThirdCity < integerChOfScondCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", firstCity, thirdCity, secondCity);
        } else if (integerChOfScondCity < integerChOfFirstCity
                && integerChOfScondCity < integerChOfThirdCity
                && integerChOfFirstCity < integerChOfThirdCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", secondCity, firstCity, thirdCity);
        } else if (integerChOfScondCity < integerChOfThirdCity
                && integerChOfScondCity < integerChOfFirstCity
                && integerChOfThirdCity < integerChOfFirstCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", secondCity, thirdCity, firstCity);
        } else if (integerChOfThirdCity < integerChOfScondCity
                && integerChOfThirdCity < integerChOfFirstCity
                && integerChOfScondCity < integerChOfFirstCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", thirdCity, secondCity, firstCity);
        } else if (integerChOfThirdCity < integerChOfScondCity
                && integerChOfThirdCity < integerChOfFirstCity
                && integerChOfFirstCity < integerChOfScondCity) {
            System.out.printf("The three cities in alphabetical order are %s %s %s", thirdCity, firstCity, secondCity);
        } else {
            System.out.println("Something has wrong");
        }
    }
}
