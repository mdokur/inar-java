package week_11.assigments;

public class Question_11_03 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(48, 2222, 20);
        System.out.println(savingsAccount.toString());

        System.out.println("-----------------------");
        CheckingAccount checkingAccount = new CheckingAccount(55, 256, 5, 2000);
        System.out.println(checkingAccount.toString());

        checkingAccount.withDraw(2850);
        System.out.println(checkingAccount.toString());
    }
}
