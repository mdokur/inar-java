package week_07.assignments;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int students = 1; students <= 100; students++) {
            for (int doors = students - 1; doors < lockers.length; doors += (students + 1)) {
                if (lockers[doors]) {
                    lockers[doors] = false;
                } else {
                    lockers[doors] = true;
                }
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
