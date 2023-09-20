package week_4.assignments;
import java.util.Scanner;
public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valid = true;

        System.out.print("Enter two characters : ");
        String majorAndStatus = input.nextLine();

        String stringOfMajor = "";
        String stringOfStatus = "";


        char major = majorAndStatus.charAt(0);
        char status = majorAndStatus.charAt(1);

        switch (major) {
            case 'M' -> stringOfMajor = "Mathematics";
            case 'C' -> stringOfMajor = "Computer Science";
            case 'I' -> stringOfMajor = "Information Technology";
            default -> {
                System.out.println("Invalid input");
                valid = false;
            }
        }
        if (valid) {
            switch (status) {
                case '1' -> stringOfStatus = " Freshman";
                case '2' -> stringOfStatus = " Sophomore";
                case '3' -> stringOfStatus = " Junior";
                case '4' -> stringOfStatus = " Senior";
                default -> {
                    System.out.println("Invalid input");
                    valid = false;
                }
            }
        }
        if (valid) {
            System.out.println(stringOfMajor.concat(stringOfStatus));
        }
    }
}
