package week_11.assigments;

import week_09.assigments.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {

    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super.setId(id);
        super.setBalance(balance);
        super.setAnnualInterestRate(annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withDraw(double amount) {
        if (amount < super.getBalance() - this.overdraftLimit) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("These process is not available.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + super.getId() +
                "\nBalance is $" + super.getBalance() +
                "\nLimit is $" + this.overdraftLimit;
    }
}
