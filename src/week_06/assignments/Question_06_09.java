package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("------------------------------------------");
        double j = 20.0;

        for (double i = 1; i <= 10; i++) {
            System.out.printf("%-8.1f %-8.3f   |     %-5.1f %10.3f\n",
                    i, feetToMeter(i),
                    j, meterToFoot(j));
            j += 5.0;
        }
    }


    public static double feetToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }


    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}

