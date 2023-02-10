package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

public class Soal24_CouponCollectorsProblem {
    public static void main(String[] args) {
        int[] deck = new int[52] ;
        int[] picks = new int[4];

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        shuffleCards(deck);

        int count = 0;
        do {
            pickCards(deck, picks);
            count++;
        } while (!isOneOfEachSuit(picks));

        print(picks);

        System.out.println("Number of picks: " + count);
    }
    public static void shuffleCards(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = pickCards(deck);
            int temp = deck[i];
            deck[i] = deck[index] ;
            deck[index] = temp;
        }
    }
    public static void pickCards(int[] deck, int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            picks[i] = deck[pickCards(deck)];
        }
    }
    public static int pickCards(int[] deck) {
        return (int)(Math.random() * deck.length);
    }
    public static boolean isOneOfEachSuit(int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (i != j && (picks[i] / 13 == picks[j] / 13))
                    return false;
            }
        }
        return true;
    }
    public static void print(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int i = 0; i < picks.length; i++) {
            System.out.println(ranks[picks[i] % 13] + " of " + suits[picks[i] / 13]);
        }
    }
}

/*
problem with many practical applications. The problem is to repeatedly pick
objects from a set of objects and find out how many picks are needed for all the
objects to be picked at least once. A variation of the problem is to pick cards from
a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
before you see one of each suit. Assume a picked card is placed back in the deck before picking another. Write a program to simulate the number of picks needed
to get four cards from each suit and display the four cards picked (it is possible a
card may be picked twice). Here is a sample run of the program:

2 of Diamonds
6 of Hearts
3 of Clubs
4 of Spades
Number of picks: 10
 */