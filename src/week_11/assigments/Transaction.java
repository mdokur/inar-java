package week_11.assigments;

import java.util.Date;

public class Transaction {
    private double amount;
    private double balance;
    private String description;
    private char type;
    private java.util.Date date;

    public Transaction() {
        date = new Date();
    }

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\n,,,,,,,,,,,,,,,,,,,,,,,," +
                "\nDate: " + date +
                "\nTransaction: " + ((this.getType() == 'w' || this.getType() == 'W') ? "Withdraw" : "Deposit") +
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + description;
    }
}
