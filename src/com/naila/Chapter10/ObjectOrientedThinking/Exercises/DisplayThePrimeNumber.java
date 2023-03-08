package com.naila.Chapter10.ObjectOrientedThinking.Exercises;

public class DisplayThePrimeNumber {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i))
                stack.push(i);
        }
        System.out.println("\nAll the prime numbers less than 120 in decreasing order:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
    public static boolean isPrime(int n) {
        for (int d = 2; d <= n / 2; d++) {
            if (n % d == 0)
                return false;
        }
        return true;
    }
}

/*
All the prime numbers less than 120 in decreasing order:
113 109 107 103 101 97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2
 */