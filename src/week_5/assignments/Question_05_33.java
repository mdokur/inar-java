package week_5.assignments;

public class Question_05_33 {
    public static void main(String[] args) {
        int sum = 1;

        System.out.println("Perfect numbers are: ");

        for (int number = 2; number <= 10000; number++) {
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    sum += number / divisor;
                }
            }
            if (number == sum) {
                System.out.println(number);
            }
            sum = 1;
        }
    }
}
