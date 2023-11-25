package week_09.assigments;

public class Question_09_06 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = createArray();

        stopWatch.start();
        sort(array);
        stopWatch.end();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort : "
                + stopWatch.getElapsed() + " milliseconds");

    }

    public static int[] createArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
