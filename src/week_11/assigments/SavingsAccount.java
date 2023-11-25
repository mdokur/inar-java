package week_11.assigments;

import week_09.assigments.Account;

public class SavingsAccount extends Account {

    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super.setId(id);
        super.setBalance(balance);
        super.setAnnualInterestRate(annualInterestRate);
    }

    @Override
    public String toString() {
        return "ID: " + super.getId() +
                "\nBalance is: $" + super.getBalance();
    }
}
