package week_10.assigments;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        queue.print();
        queue.dequeue();
        System.out.println("\nProcess of Dequeue: ");
        queue.print();
    }
}
