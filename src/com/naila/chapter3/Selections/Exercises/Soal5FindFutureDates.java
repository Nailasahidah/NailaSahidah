package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal5FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today’s day: ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        int futureDay = (day + daysElapsed) % 7;
        System.out.print("Today is ");
        switch (day)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
        System.out.print(" and the future day is ");
        switch (futureDay)
        {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }
}

/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1,... , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week. Here is a sample run:
Enter today’s day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
 */