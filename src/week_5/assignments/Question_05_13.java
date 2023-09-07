package week_5.assignments;

public class Question_05_13 {
    public static void main(String[] args) {
        int n = 0;
        int lastN = 0;

        while (n < Math.pow(12000, 1.0 / 3)) {
            n++;
            lastN = n - 1;
        }
        System.out.println("The largest n is: " + lastN);
    }
}
