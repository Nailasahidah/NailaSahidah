package com.naila.chapter5.Loops.Exercises;

public class Soal39FindTheSalesAmount {
    public static void main(String[] args) {
        final double COMMISSION_SOUGHT = 30000;
        double salesAmount,
                commission,
                balance;
        salesAmount = 0;
        do {
            balance = commission = 0;
            salesAmount += 0.01;

            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.12;

            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.10;

            if (salesAmount > 0)
                commission += balance * 0.08;

        } while (commission < COMMISSION_SOUGHT);

        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
    }
}

/*(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission rate.
Sales Amount             Commission Rate
$0.01–$5,000                 8%
$5,000.01–$10,000            10%
$10,000.01 and above         12%
Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5,000 * 8 + 5,000 * 10 + 15,000 * 12 = 2,700
Your goal is to earn $30,000 a year. Write a program that finds out the minimum number of sales you have to generate in order to make $30,000.

 */