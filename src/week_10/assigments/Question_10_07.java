package week_10.assigments;

import java.util.Scanner;

import week_09.assigments.Account;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            //accounts[i] = new Account(i, 100);
        }
        while (accounts.length == 10) {
            System.out.println("Enter an id: ");
            int id = input.nextInt();

            while (id >= 0 && id <= 9) {
                System.out.println("main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
                System.out.println("Enter a choice: ");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.println("Enter an amount to withdraw: ");
                    int amountWithDraw = input.nextInt();
                    accounts[id].withDraw(amountWithDraw);
                } else if (choice == 3) {
                    System.out.println("Enter an amount to deposit: ");
                    int amountDeposit = input.nextInt();
                    accounts[id].deposit(amountDeposit);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Please enter an choice: ");
                }
            }
        }
    }
}
