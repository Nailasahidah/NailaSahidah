package com.naila.chapter5.Loops.Exercises;

import java.util.Scanner;

public class Soal30CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double compoundValue = 0;
        for (int m = 1; m <= months; m++) {
            compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
        }

        System.out.printf(
                "Amount in savings account after " +
                        months + " months: $%.2f\n", compoundValue);
    }
}
/*0 (Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05 / 12 = 0.00417. After the first month, the value in the
account becomes
100 * (1 + 0.00417) = 100.417
 After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
 After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
 and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), and the number of months (e.g., 6) then displays the
amount in the savings account after the given month.

 */