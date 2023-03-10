package com.naila.chapter4.MathematicalFunctionsCharactersAndStrings.Exercises;

import java.util.Scanner;

public class Soal23FinancialApplicationPayroll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter employee's name: ") ;
        String name = input.next() ;
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble() ;
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble() ;
        System.out.print("Enter federal tax withholding rate: " );
        double federalTaxRate = input.nextDouble() ;
        System.out.print("Enter state tax withholding rate: " );
        double stateTaxRate = input.nextDouble() ;

        double grossPay, federal, state, totalDeduction;
        System.out.printf("Employee Name: " + name +
                "\nHours Worked: " + hoursWorked +
                "\nPay Rate: $" + (grossPay = hoursWorked * hourlyPayRate) +
                "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
                "\nDeductions:\n Federal Witholding (20.0%): $" + (federal = grossPay * federalTaxRate) +
                "\n State Witholding (90%): $" + (state = grossPay * stateTaxRate) +
                "\n Total Deduction : $" + (totalDeduction = federal + state) +
                "\nNet Pay: $" + (grossPay - totalDeduction)
        );
    }
}


/*(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
A sample run is as follows:
Enter employee’s name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.50
Deductions:
 Federal Withholding (20.0%): $19.50
 State Withholding (9.0%): $8.77
 Total Deduction: $28.27
Net Pay: $69.22

 */