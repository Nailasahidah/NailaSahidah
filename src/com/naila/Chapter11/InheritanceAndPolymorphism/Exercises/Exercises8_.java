package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

public class Exercises8_ {
    public static void main(String[] args) {
        AccountWithTransaction account = new AccountWithTransaction("George", 1122, 1000);

        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("     Account Summary");
        System.out.println("---------------------------------");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of Transactions");
        System.out.println("----------------------------------");
        for (int i = 0; i < account.getTransaction().size(); i++) {
            System.out.println("Date: " +
                    (account.getTransaction()).get(i).getDate());
            System.out.println("Type: " +
                    (account.getTransaction()).get(i).getType());
            System.out.println("Amount: " +
                    (account.getTransaction()).get(i).getAmount());
            System.out.println("Balance: " +
                    (account.getTransaction()).get(i).getBalance());
            System.out.println("Description: " +
                    (account.getTransaction()).get(i).getDescription());
            System.out.println();
        }
    }
}


/*
     Account Summary
---------------------------------
Account holder name: George
Interest rate: 1.5
Balance: $109.00

     List of Transactions
----------------------------------
Date: Tue Mar 14 21:31:36 PDT 2023
Type: D
Amount: 30.0
Balance: 30.0
Description: Deposit to account

Date: Tue Mar 14 21:31:36 PDT 2023
Type: D
Amount: 40.0
Balance: 70.0
Description: Deposit to account

Date: Tue Mar 14 21:31:36 PDT 2023
Type: D
Amount: 50.0
Balance: 120.0
Description: Deposit to account

Date: Tue Mar 14 21:31:36 PDT 2023
Type: W
Amount: 5.0
Balance: 115.0
Description: Withdraw1 from account

Date: Tue Mar 14 21:31:36 PDT 2023
Type: W
Amount: 4.0
Balance: 111.0
Description: Withdraw1 from account

Date: Tue Mar 14 21:31:36 PDT 2023
Type: W
Amount: 2.0
Balance: 109.0
Description: Withdraw1 from account


Process finished with exit code 0

 */
