package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable     Single     Married Joint     Married     Head of");
        System.out.println("Income                 or Qualifying     Separate    a House");
        System.out.println("                       Window(er)                           ");
        System.out.println("-------------------------------------------------------------");
        for (int i = 50000; i <= 60000; i += 50) {
            System.out.printf("$%-10d $%-10d $%-15d $%-10d $%d\n",
                    i,
                    Math.round(computeTax(0, i)),
                    Math.round(computeTax(1, i)),
                    Math.round(computeTax(2, i)),
                    Math.round(computeTax(3, i)));
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        if (status == 0) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 33_950) {
                tax = (8_350 * 0.10) + (taxableIncome - 8_350) * 0.15;
            } else if (taxableIncome <= 82_250) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((taxableIncome - 33_950) * 0.25);
            } else if (taxableIncome <= 171_550) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((82_250 - 33_950) * 0.25) +
                        ((taxableIncome - 82_250) * 0.28);
            } else if (taxableIncome <= 372_950) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((82_250 - 33_950) * 0.25) +
                        ((171_550 - 82_250) * 0.28) + ((taxableIncome - 171_550) * 0.33);
            } else {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((82_250 - 33_950) * 0.25) +
                        ((171_550 - 82_250) * 0.28) + ((372_950 - 171_550) * 0.33) +
                        ((taxableIncome - 372_950) * 0.35);
            }
        } else if (status == 1) {
            if (taxableIncome <= 16_700) {
                tax = (taxableIncome * 0.10);
            } else if (taxableIncome <= 67_900) {
                tax = (16_700 * 0.10) + ((taxableIncome - 16_700) * 0.15);
            } else if (taxableIncome <= 137_050) {
                tax = (16_700 * 0.10) + ((67_900 - 16_700) * 0.15) + ((taxableIncome - 67_900) * 0.25);
            } else if (taxableIncome <= 208_850) {
                tax = (16_700 * 0.10) + ((67_900 - 16_700) * 0.15) + ((137_050 - 67_900) * 0.25) +
                        ((taxableIncome - 137_050) * 0.28);
            } else if (taxableIncome <= 372_950) {
                tax = (16_700 * 0.10) + ((67_900 - 16_700) * 0.15) + ((137_050 - 67_900) * 0.25) +
                        ((208_850 - 137_050) * 0.28) + ((taxableIncome - 208_850) * 0.33);
            } else {
                tax = (16_700 * 0.10) + ((67_900 - 16_700) * 0.15) + ((137_050 - 67_900) * 0.25) +
                        ((208_850 - 137_050) * 0.28) + ((372_950 - 208_850) * 0.33) +
                        ((taxableIncome - 372_950) * 0.35);
            }
        } else if (status == 2) {
            if (taxableIncome <= 8_350) {
                tax = (taxableIncome * 0.10);
            } else if (taxableIncome <= 33_950) {
                tax = (8_350 * 0.10) + ((taxableIncome - 8_350) * 0.15);
            } else if (taxableIncome <= 68_525) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((taxableIncome - 33_950) * 0.25);
            } else if (taxableIncome <= 104_425) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((68_525 - 33_950) * 0.25) +
                        ((taxableIncome - 68_525) * 0.28);
            } else if (taxableIncome <= 186_475) {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((68_525 - 33_950) * 0.25) +
                        ((104_425 - 68_525) * 0.28) + ((taxableIncome - 104_425) * 0.33);
            } else {
                tax = (8_350 * 0.10) + ((33_950 - 8_350) * 0.15) + ((68_525 - 33_950) * 0.25) +
                        ((104_425 - 68_525) * 0.28) + ((186_475 - 104_425) * 0.33) + ((taxableIncome - 186_475) * 0.35);
            }
        } else if (status == 3) {
            if (taxableIncome <= 11_950) {
                tax = (taxableIncome * 0.10);
            } else if (taxableIncome <= 45_500) {
                tax = (11_950 * 0.10) + ((taxableIncome - 11_950) * 0.15);
            } else if (taxableIncome <= 117_450) {
                tax = (11_950 * 0.10) + ((45_500 - 11_950) * 0.15) + ((taxableIncome - 45_500) * 0.25);
            } else if (taxableIncome <= 190_200) {
                tax = (11_950 * 0.10) + ((45_500 - 11_950) * 0.15) + ((117_450 - 45_500) * 0.25) +
                        ((taxableIncome - 117_450) * 0.28);
            } else if (taxableIncome <= 372_950) {
                tax = (11_950 * 0.10) + ((45_500 - 11_950) * 0.15) + ((117_450 - 45_500) * 0.25) +
                        ((190_200 - 117_450) * 0.28) + ((taxableIncome - 190_200) * 0.33);
            } else {
                tax = (11_950 * 0.10) + ((45_500 - 11_950) * 0.15) + ((117_450 - 45_500) * 0.25) +
                        ((190_200 - 117_450) * 0.28) + ((372_950 - 190_200) * 0.33) +
                        ((taxableIncome - 372_950) * 0.35);
            }
        }
        return tax;
    }
}
