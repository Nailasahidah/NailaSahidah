package com.naila.chapter5.Loops.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal22LoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble() ;
        System.out.print("Number of Years: ");
        int years = input.nextInt() ;
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble() ;

        double monthlyRate = annualRate / 1200 ;

        double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12)) ;
        System.out.printf("MonthlyPayment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

        double balance = loanAmount, principal, interest;
        System.out.println("Payment#    Interest    principal   Balance");
        for (int i = 1; i <= years * 12; i++){
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest ;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
        }
    }
}
/*(Financial application: loan amortization schedule) The monthly payment for a given
loan pays the principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal
paid for the month is therefore the monthly payment minus the monthly interest. Write
a program that lets the user enter the loan amount, number of years, and interest rate
then displays the amortization schedule for the loan. Here is a sample run:

Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: 7
Monthly Payment: 865.26
Total Payment: 10383.21
Payment# Interest Principal Balance
1 58.33 806.93 9193.07
2 53.62 811.64 8381.43
...
11 10.00 855.26 860.27
12 5.01 860.25 0.01

 */