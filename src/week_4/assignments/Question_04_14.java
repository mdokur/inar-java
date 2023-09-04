package week_4.assignments;
import java.util.Scanner;
public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade : ");
        String grade = input.nextLine();

        int valueOfGrade = -1;

        switch (grade.charAt(0)) {
            case 'A' -> valueOfGrade = 4;
            case 'B' -> valueOfGrade = 3;
            case 'C' -> valueOfGrade = 2;
            case 'D' -> valueOfGrade = 1;
            case 'F' -> valueOfGrade = 0;
            default -> System.out.printf("%s is an invalid grade", grade);
        }

        if (valueOfGrade >= 0 && valueOfGrade <= 4) {

            System.out.printf("The numeric value for grade %s is %d", grade, valueOfGrade);

        } else {

            System.exit(1);
        }
    }
}
