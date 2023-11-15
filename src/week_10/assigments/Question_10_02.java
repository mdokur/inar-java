package week_10.assigments;

public class Question_10_02 {
    public static void main(String[] args) {
        BMI bmi = new BMI("Martin", 25, 56, 1, 3);
        System.out.println("Name : " + bmi.getName());
        System.out.println("BMI  : " + bmi.getBMIValue() + " " + bmi.getResultBMI());
    }
}
