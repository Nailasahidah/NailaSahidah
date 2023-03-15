package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

import javax.management.MBeanAttributeInfo;

public class Exercises3_ {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        SavingsAccount savings = new SavingsAccount(1001, 20000);
        CheckingAccount checking = new CheckingAccount(1004, 20000, -20);

        account.setAnnualInterestRate(4.5);
        savings.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        savings.withdraw(2500);
        checking.withdraw(2500);

        account.deposit(3000);
        savings.deposit(3000);
        checking.deposit(3000);


        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
    }
}

/*
Error! Savings account overdrawn transaction rejected
Error! Amount exceeds overdraft limit.

Account ID: 0
Date created: Sat Mar 11 08:01:52 PST 2023
Balance: $500.00
Monthly interest: $1.88

Account ID: 0
Date created: Sat Mar 11 08:01:52 PST 2023
Balance: $3000.00
Monthly interest: $11.25

Account ID: 0
Date created: Sat Mar 11 08:01:52 PST 2023
Balance: $3000.00
Monthly interest: $11.25
Overdraft limit: $-20.00
 */
