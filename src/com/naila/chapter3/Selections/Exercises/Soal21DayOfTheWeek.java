package com.naila.chapter3.Selections.Exercises;

import java.util.Scanner;

public class Soal21DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        if (month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.print("Day of the week is ");
        switch(dayOfWeek)
        {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
    }
}

/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week. The formula is
h = aq + 26(m10+ 1) + k + k4 + 4j + 5jb,7
where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, and 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, ..., 12: December). January and February
are counted as months 13 and 14 of the previous year.
■ j is year 100 .
■ k is the year of the century (i.e., year % 100).
Note all divisions in this exercise perform an integer division. Write a program
that prompts the user to enter a year, month, and day of the month, and displays
the name of the day of the week. Here are some sample runs:

Enter year: (e.g., 2012): 2015
Enter month: 1−12: 1
Enter the day of the month: 1−31: 25
Day of the week is Sunday
Enter year: (e.g., 2012): 2012
Enter month: 1−12: 5
Enter the day of the month: 1−31: 12
Day of the week is Saturday

(Hint: January and February are counted as 13 and 14 in the formula, so you need
to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
the previous year. For example, if the user enters 1 for m and 2015 for year, m will
be 13 and year will be 2014 used in the formula.)
 */