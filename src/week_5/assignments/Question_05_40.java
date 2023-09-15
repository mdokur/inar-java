package week_5.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int Heads = 0;
        int Tails = 0;

        for (int i = 1; i <= 1000000; i++) {
            int coin = (int) (Math.random() * 2);
            if (coin == 0) {
                Heads++;
            } else {
                Tails++;
            }
        }
        System.out.printf("Flipping a coin one million times...\nHeads: %d \nTails: %d", Heads, Tails);
    }
}
