package com.naila.chapter4.latihan;

import java.util.Scanner;

public class escape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Hello to me") ;
        // escape mempunyai 2 karakter terbalik

        // Demo escape squence \t
        System.out.println("\tHello to me") ;

        // Demo escape squence \b
        System.out.println("Hello to \bme") ;

        // Demo escape squence \'
        System.out.println("Hello to \'me\'") ;

        // Demo escape squence \"
        System.out.println("Hello to \"me\"") ;

        // Demo escape squence \\
        System.out.println("Hello to \\me\\") ;

        // Demo escape squence \n
        System.out.println("Hello to \nme") ;

        // Demo escape squence \r
        System.out.println("Hello to \rme") ;

        // Demo escape squence \f
        System.out.println("Hello to \fme\f") ;

    }
}
