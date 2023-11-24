package week_11.assigments;

public class Question_11_08 {
    public static void main(String[] args) {
        Account account = new Account(1001, 100000, 5, "Arthur");

        System.out.println(account.toString());
        account.deposit(10);
        account.deposit(100);
        account.deposit(1000);
        account.withDraw(5);
        account.withDraw(50);
        account.withDraw(500);

        System.out.println(account.getTransaction());
        System.out.println(account.toString());
    }
}
