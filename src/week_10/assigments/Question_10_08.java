package week_10.assigments;

public class Question_10_08 {
    public static void main(String[] args) {
        Tax tax = new Tax();
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        System.out.printf("%30s", "2009 Taxes");
        System.out.println("\nIncome   Status 0   Status 1   Status 2   Status 3 ");
        System.out.println("----------------------------------------------------");

        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%-9d%-11.2f%-11.2f%-11.2f%-11.2f\n", income
                    , tax.computeTax(rates, brackets, 0, income)
                    , tax.computeTax(rates, brackets, 1, income)
                    , tax.computeTax(rates, brackets, 2, income)
                    , tax.computeTax(rates, brackets, 3, income));
        }
    }
}

