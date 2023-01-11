package com.naila.chapter5.Loops.Exercises;

public class Soal43Combinations {
    public static void main(String[] args) {
        int count = 0;
        for (int number1 = 1; number1 < 7; number1++) {
            for (int number2 = number1 + 1; number2 <= 7; number2++) {
                System.out.println(number1 + " " + number2);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}


/*(Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
1 2
1 3
...
...
The total number of all combinations is 21

 */