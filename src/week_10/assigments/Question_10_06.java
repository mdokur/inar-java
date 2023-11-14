package week_10.assigments;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();


        for (int i = 2; i <120 ; i++) {
            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }

        while (!stackOfIntegers.isEmpty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
