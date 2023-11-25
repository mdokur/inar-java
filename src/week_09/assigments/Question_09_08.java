package week_09.assigments;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan = new Fan(3, true, 10, "yellow");

        System.out.println(fan.toString());
        System.out.println("-------------------------------------");
        fan.setOn(false);
        System.out.println(fan.toString());
    }
}
