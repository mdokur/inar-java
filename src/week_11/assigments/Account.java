package week_11.assigments;

import java.util.ArrayList;

public class Account extends week_09.assigments.Account {
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(int id, double balance, double annualInterestRate, String name) {
        super.setId(id);
        super.setBalance(balance);
        super.setAnnualInterestRate(annualInterestRate);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
        Transaction transactionWithDraw = new Transaction('W', amount, getBalance(), "Withdraw from ATM");
        transactions.add(transactions.size(), transactionWithDraw);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        Transaction transactionWithDraw = new Transaction('D', amount, getBalance(), "Deposit to Bank");
        transactions.add(transactions.size(), transactionWithDraw);
    }

    @Override
    public String toString() {
        return "\n,,,,,,,,,,,,,,,,,,,,,," +
                "\nName    : " + name +
                "\nID      : " + super.getId() +
                "\nBalance : " + super.getBalance();
    }
}
