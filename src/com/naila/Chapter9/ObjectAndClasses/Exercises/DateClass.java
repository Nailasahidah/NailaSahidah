package com.naila.Chapter9.ObjectAndClasses.Exercises;

public class DateClass {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        System.out.println("\nThe dates and times for elapsedtimes 10000, " +
                "100000, 100000, 10000000, \n100000000, 1000000000, 10000000000," +
                " and 100000000000, respectively");

        for (long i = 10000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}

/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively


The dates and times for elapsedtimes 10000, 100000, 100000, 10000000,
100000000, 1000000000, 10000000000, and 100000000000, respectively
Wed Dec 31 16:00:10 PST 1969
Wed Dec 31 16:01:40 PST 1969
Wed Dec 31 16:16:40 PST 1969
Wed Dec 31 18:46:40 PST 1969
Thu Jan 01 19:46:40 PST 1970
Mon Jan 12 05:46:40 PST 1970
Sun Apr 26 10:46:40 PDT 1970
Sat Mar 03 01:46:40 PST 1973
 */