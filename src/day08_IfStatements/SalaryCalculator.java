package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRates = 50,
                weeklyHours = 45;

        double stateTaxRates = 6.5,
                federalTaxRate = 26.2;

        //-------------------------------------

        int salaryBeforeTax = hourlyRates * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRates / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("stateTax is= $ " + stateTax);
        System.out.println("federalTax = $ " + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTax);

    }
}
