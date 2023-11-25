package week_05.assignments;

import org.w3c.dom.ls.LSOutput;

public class Question_05_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        int tuitionOfTenthYear = 0;
        int tuitionOfTotal = 0;

        for (int i = 1; i <= 14; i++) {
            tuition += tuition * 5 / 100;
            if (i == 10) {
                tuitionOfTenthYear = tuition;
            } else if (i > 10) {
                tuitionOfTotal += tuition;
            }
        }
        System.out.println("Tuition in ten years: $" + tuitionOfTenthYear);
        System.out.println("Total cost for four years' worth of tuition after the tenth year: $" + tuitionOfTotal);
    }
}
