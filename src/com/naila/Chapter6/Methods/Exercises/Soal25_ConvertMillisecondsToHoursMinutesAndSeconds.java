package com.naila.Chapter6.Methods.Exercises;

import java.util.Scanner;

public class Soal25_ConvertMillisecondsToHoursMinutesAndSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();
        System.out.println("hours:minuties:seconds: " + convertMillis(millis));
    }
    public static String convertMillis(long millis) {
        millis /= 1000;
        String currentMinuteAndSecond = "";
        for (int i = 0; i < 2; i++) {
            currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
            millis /= 60;
        }
        return millis + currentMinuteAndSecond;
    }
}

/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns a string 0:0:5, convertMillis(100000)
returns a string 0:1:40, and convertMillis(555550000) returns a string
154:19:10. Write a test program that prompts the user to enter a long integer
for milliseconds and displays a string in the format of hours:minutes:seconds.
 */