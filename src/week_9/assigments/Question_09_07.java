package week_9.assigments;

public class Question_09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20500);
        System.out.println("          Account Statement          ");
        System.out.println("-------------------------------------");
        System.out.println("Account ID      : " + account.getId());
        System.out.println("Date created    : " + account.getDateCreated());
        System.out.println("Balance         : $" + account.getBalance());
        System.out.println("Monthly interest: $" + account.getMonthlyInterest(4.5, account.getBalance()));
    }
}
