package com.naila.Chapter10.ObjectOrientedThinking.Latihan;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n" ,
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}

/*
Enter annual interest rate, for example, 8.25: 3.45
Enter number of years as an integer: 2004
Enter loan amount, for example, 120000.95: 170000.17
The loan was created on Wed Mar 01 12:11:52 PST 2023
The monthly payment is 488.75
The total payment is 11753471.75

 */
