package week_10.assigments;

public class Queue {
    private int[] elements;
    private int size;
    private static int DEFAULT_CAPACITY = 8;

    public Queue() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int number) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2 + 1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = number;
        size++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty now!");
            System.exit(-1);
        }
        int result = this.elements[0];
        shiftElementToLeft(this.elements);
        size--;
        return result;
    }

    public int[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public static void shiftElementToLeft(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
