package com.naila.chapter13.AbstractClassesAndInterfaces.Latihan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));

        Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
        String[] dayNameOfWeek = {"sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}

/*
Current time is Tue Mar 07 16:15:22 PST 2023
YEAR: 2023
MONTH: 2
DATE: 7
HOUR: 4
HOUR_OF_DAY: 16
MINUTE: 15
SECOND: 22
DAY_OF_WEEK: 3
DAY_OF_MONTH: 7
DAY_OF_YEAR: 66
WEEK_OF_MONTH: 2
WEEK_OF_YEAR: 10
AM_PM: 1
December 25, 1997 is a Thursday
 */