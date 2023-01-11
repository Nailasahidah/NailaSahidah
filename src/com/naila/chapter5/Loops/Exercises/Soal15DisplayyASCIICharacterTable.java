package com.naila.chapter5.Loops.Exercises;

public class Soal15DisplayyASCIICharacterTable {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            count ++ ;

            if (count % 10 == 0)
                System.out.println((char)i);
            else System.out.println((char)i + " ");
        }
        System.out.println();
    }
}


/*(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line.The ASCII
table is given in Appendix B. Characters are separated by exactly one space.

 */