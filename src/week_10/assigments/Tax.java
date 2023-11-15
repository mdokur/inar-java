package week_10.assigments;

public class Tax {
    private int fillingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 0;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.fillingStatus = fillingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFillingStatus() {
        return this.fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double computeTax(double[] rates, int[][] brackets, int status, int income) {
        double tax = 0;

        if (income <= brackets[status][0]) {
            tax = income * rates[0];

        } else if (income <= brackets[status][1]) {
            tax = brackets[status][0] * rates[0] +
                    (income - brackets[status][0]) * rates[1];

        } else if (income <= brackets[status][2]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1])
                    + (income - brackets[status][1]) * rates[2];

        } else if (income <= brackets[status][3]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((income - brackets[status][2]) * rates[3]);

        } else if (income <= brackets[status][4]) {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((brackets[status][3] - brackets[status][2]) * rates[3]) +
                    ((income - brackets[status][3]) * rates[4]);

        } else {
            tax = brackets[status][0] * rates[0] +
                    ((brackets[status][1] - brackets[status][0]) * rates[1]) +
                    ((brackets[status][2] - brackets[status][1]) * rates[2]) +
                    ((brackets[status][3] - brackets[status][2]) * rates[3]) +
                    ((brackets[status][4] - brackets[status][3]) * rates[4]) +
                    ((income - brackets[status][4]) * rates[5]);
        }
        return tax;
    }
}
