package week_7.assignments;

import java.util.Arrays;

public class Question_07_16 {
    public static void main(String[] args) {

        int[] array = createArray();
        int key = createKey();

        long startTimeLinear = System.currentTimeMillis();
        doLinearSearch(array, key);
        long endTimeLinear = System.currentTimeMillis();
        System.out.println("Execution time of invoking the linear Search in milliseconds: " +
                (endTimeLinear - startTimeLinear));

        selectionSort(array);

        long startTimeBinary = System.currentTimeMillis();
        doBinarySearch(array, key);
        long endTimeBinary = System.currentTimeMillis();
        System.out.println("Execution time of invoking the Binary Search in milliseconds: " +
                (endTimeBinary - startTimeBinary));
    }

    public static void doBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key == arr[mid]) {
                break;
            } else {
                low = mid + 1;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void doLinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                break;
            }
        }
    }

    public static int createKey() {
        return (int) (Math.random() * 100000);
    }

    public static int[] createArray() {
        int[] arr = new int[(100000)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }
}
