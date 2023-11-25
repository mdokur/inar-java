package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 0;
        int j=0;

        for (int i = 1; i <= 100000; i++) {
            e +=(double) 1 / (i * (i + 1));
            j++;

            if (j % 10000 == 0) {
                System.out.println("e at i = " + j + " is " + (e+2));
            }
        }
        System.out.println("Java's e is " + Math.E);
    }
}
