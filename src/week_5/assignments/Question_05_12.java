package week_5.assignments;

public class Question_05_12 {
    public static void main(String[] args) {
        int n = 0;
        int lastN = 0;

        while (n < Math.sqrt(12000)) {
            n++;
            lastN = n * -1;
        }
        System.out.println("The smallest n is: " + lastN);
    }
}
