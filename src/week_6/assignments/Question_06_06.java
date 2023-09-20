package week_6.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int numberOfRows = input.nextInt();
        displayPattern(numberOfRows);
    }

    public static void displayPattern(int n) {
        for( int i =1; i<=n ; i++){
            for (int j =1; j<=7-i ; j++){
                System.out.print ("  ");
            }
            for (int k = i; k >= 1 ; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
