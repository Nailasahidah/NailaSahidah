package com.naila.Chapter10.ObjectOrientedThinking.Latihan;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
    }
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        return result;
    }
}

/*
Enter an integer: 50
50! is
30414093201713378043612608166064768844377641568960512000000000000

 */