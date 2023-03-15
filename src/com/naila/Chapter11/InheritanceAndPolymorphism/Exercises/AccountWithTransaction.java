package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

import java.util.ArrayList;
import java.util.Date;

public class AccountWithTransaction {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transaction;

    AccountWithTransaction() {
        name = " " ;
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transaction = new ArrayList<Transaction>();
    }

    AccountWithTransaction(int id, double balance) {
        name = " " ;
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transaction = new ArrayList<Transaction>();
    }

    AccountWithTransaction(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
       this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
        transaction.add(new Transaction('W', amount, balance, "Withdraw1 from account"));
    }
    public void deposit(double amount) {
        balance += amount;
        transaction.add(new Transaction('D', amount, balance, "Deposit to account"));
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }
}
