package week_4.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee's name : ");
        String nameOfEmployee = input.nextLine();

        System.out.print("Enter the number of hours worked in a week : ");
        double numberOfHoursWorkedWeekly = input.nextDouble();

        System.out.print("Enter the hourly pay rate : ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter the federal tax with holding rate : ");
        double federalTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter the state tax with holding rate : ");
        double stateTaxWithholdingRate = input.nextDouble();

        double grossPay = numberOfHoursWorkedWeekly * hourlyPayRate;
        double federalWithHolding = grossPay * federalTaxWithholdingRate;
        double stateWithHolding = grossPay * stateTaxWithholdingRate;
        double totalDeduction = federalWithHolding + stateWithHolding;
        double netPay = grossPay - totalDeduction;


        System.out.printf("Employee Name : %s\n" +
                        "Hours Worked : %.2f\n" +
                        "Pay Rate : $%3.2f\n" +
                        "Gross Pay : $%3.2f\n" +
                        "Deductions : \n" +
                        "    Federal Withholding (%3.1f%%) : $%.2f\n" +
                        "    State Withholding (%3.1f%%) : $%.2f\n" +
                        "    Total Deduction : $%.2f\n" +
                        "Net Pay : $%.2f",
                nameOfEmployee,
                numberOfHoursWorkedWeekly,
                hourlyPayRate,
                grossPay,
                (int) (federalTaxWithholdingRate * 1000) / 10.0,
                federalWithHolding,
                (int) (stateTaxWithholdingRate * 1000) / 10.0,
                stateWithHolding,
                totalDeduction,
                netPay);

    }
}
