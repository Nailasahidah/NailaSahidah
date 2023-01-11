package com.naila.chapter5.Loops.Exercises;

public class Soal19DisplayNumbersInaPyramidPattern {
    public static void main(String[] args) {
        int startRight = 0,
                endSpace = 7;
        for (int row = 1; row <= 128; row += row){
            for (int startSpace = 0; startSpace < endSpace; startSpace++){
                System.out.print("  ");
            }
            for (int I = 1; I <= row; I += I) {
                System.out.printf("%4d",(I)) ;
            }
            for (int r = startRight; r > 0 ; r /= 2) {
                System.out.printf("%4d",    (r));
            }
            System.out.println();
            endSpace-- ;
            startRight = row;
        }
    }
}


/*(Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output:
1
121
1242 1
124842 1
1248 16 8421
1248 16 32 16 8 421
1248 16 32 64 32 168421
 1 248 16 32 64 128 64 32 16 8 4 2 1

 */
