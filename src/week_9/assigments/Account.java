package week_9.assigments;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    Account(){
        this.id =0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate(double annualInterestRate){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(double annualInterestRate, double balance){
        return balance * getMonthlyInterestRate(annualInterestRate);
    }
    public void withDraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }
    public void deposit(double amount){
        balance += amount;
    }
}
