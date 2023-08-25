package week_3.assignments;

public class Question_03_16 {
    public static void main(String[] args) {
        int coordinateX = (int) (Math.random() * (50 + 50) - 50);
        int coordinateY = (int) (Math.random() * 100 + 100) - 100;

        System.out.println("Random coordinate in rectangle centered at (0,0) with 100 and height 200: ("
                            + coordinateX + "," + coordinateY + ")");
    }
}
