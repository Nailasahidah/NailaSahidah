package com.naila.Chapter6.Methods.Latihan;

import com.sun.security.jgss.GSSUtil;

public class Listing4Increment {
    public static void main(String[] args) {
        int x = 1 ;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call. x is " + x);
    }

    public static void increment(int n) {
        n++ ;
        System.out.println("n inside the method is " + n);
    }
}
