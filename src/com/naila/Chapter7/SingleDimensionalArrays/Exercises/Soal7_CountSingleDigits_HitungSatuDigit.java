package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

public class Soal7_CountSingleDigits_HitungSatuDigit {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 1; i <= 100; i++) {
            counts[(int)(Math.random() * 10)]++ ;
        }
        System.out.println("count for each number between 0 and 9: ");
        for (int i = 0; i < counts.length; i++){
            System.out.println(i + "s: " + counts[i]);
        }
    }
}

/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers,
say counts, to store the counts for the number of 0s, 1s,..., 9s.)
(Hitung satu digit) Tulis program yang menghasilkan 100 bilangan bulat acak antara 0 dan 9
dan menampilkan hitungan untuk setiap angka. (Petunjuk: Gunakan larik 10 bilangan bulat,
misalnya hitungan, untuk menyimpan hitungan jumlah 0, 1, . . . , 9.)

count for each number between 0 and 9:
0s: 7
1s: 16
2s: 7
3s: 6
4s: 6
5s: 16
6s: 10
7s: 11
8s: 15
9s: 6
 */
