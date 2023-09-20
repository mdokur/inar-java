package week_6.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit   |   Fahrenheit   Celsius");
        System.out.println("-----------------------------------------------");
        double j = 120.0;

        for (double i = 40; i >= 31; i--) {
            System.out.printf("%-9.1f %-10.1f   |   %7.1f %10.2f\n",
                    i, celsiusToFahrenheit(i),
                    j, fahrenheitToCelsius(j));
            j -= 10.0;
        }
    }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }
}
