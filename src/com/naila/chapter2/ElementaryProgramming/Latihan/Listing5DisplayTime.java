package com.naila.chapter2.ElementaryProgramming.Latihan;
import java.util.Scanner ;
public class Listing5DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter an integer for seconds: ") ;
        int seconds = input.nextInt() ;

        int minutes = seconds / 60 ;
        int remainingSeconds = seconds % 60 ;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}

// Enter an integer for seconds: 500
// 500 seconds is 8 minutes and 20 seconds
