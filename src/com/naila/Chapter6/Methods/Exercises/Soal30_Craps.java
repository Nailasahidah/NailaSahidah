package com.naila.Chapter6.Methods.Exercises;

public class Soal30_Craps {
    public static void main(String[] args) {
        int point = rollTwoDice();
        int result = getresult(point) ;
        if (isNaturalOrCraps(result))
            printResult(result);
        else {
            rollTillWinOrLose(result);
        }
    }
    public  static int rollDice() {
        return (int) (1 + Math.random() * 6);
    }
    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }
    public static int getresult(int point) {
        switch (point) {
            case 2  :
            case 3  :
            case 12 : point = 0; break;
            case 7  :
            case 11 : point = 1; break;
        }
        return point;
    }
    public static void printResult(int result) {
        if (result == 0)
            System.out.println("You lose");
        else if (result == 1)
            System.out.println("You win");
    }
    public static boolean isNaturalOrCraps(int result) {
        return result == 0 || result == 1;
    }
    public static void rollTillWinOrLose(int point) {
        int result;

        do {
            result = rollTwoDice();
        } while (result != point && result != 7);
        if (result == 7)
            printResult(0);
        else
            printResult(1);
    }
}


/*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.

You rolled 5 + 6 = 11
You win

You rolled 1 + 2 = 3
You lose

You rolled 4 + 4 = 8
point is 8
You rolled 6 + 2 = 8
You win

You rolled 3 + 2 = 5
point is 5
You rolled 2 + 5 = 7
You lose
 */