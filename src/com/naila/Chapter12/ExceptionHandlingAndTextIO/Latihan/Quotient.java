package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt() ;

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    }
}

/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 3 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.Quotient.main(Quotient.java:13)

Karena suatu bilangan tidak bisa dibagi 0
 */