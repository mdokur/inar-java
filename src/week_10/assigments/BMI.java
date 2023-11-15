package week_10.assigments;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;
    private double bmiValue;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMIValue() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        bmiValue = Math.round(bmi * 100) / 100.0;
        return bmiValue;
    }

    public String getResultBMI() {
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue < 25) {
            return "Normal";
        } else if (bmiValue < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void displayResult() {
        System.out.println("Name : " + getName());
        System.out.println("BMI  : " + getBMIValue() + " " + getResultBMI());
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getFeet() {
        return this.feet;
    }

    public double getInches() {
        return this.inches;
    }

    public double getHeight() {
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }
}
