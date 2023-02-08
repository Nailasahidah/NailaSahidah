package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal5_PrintDistinctNumbers_MencetakAngkaYangBerbeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int[] distinctNumbers = new int[10] ;
        int num;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            if ( isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < distinctNumbers.length; i++){
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
/*
(Print distinct numbers) Write a program that reads in 10 numbers and displays the
number of distinct numbers and the distinct numbers in their input order and separated by exactly one space (i.e., if a number appears multiple times, it is displayed
only once). (Hint: Read a number and store it to an array if it is new. If the number is
already in the array, ignore it.) After the input, the array contains the distinct numbers.
Here is the sample run of the program:
(Mencetak angka yang berbeda) Tulis program yang membaca dalam 10 angka dan menampilkan
jumlah angka yang berbeda dan angka yang berbeda dalam urutan inputnya dan dipisahkan dengan tepat satu spasi (yaitu, jika sebuah angka muncul beberapa kali, itu akan ditampilkan
hanya sekali). (Petunjuk: Baca nomor dan simpan ke array jika baru. Jika nomornya
sudah ada di dalam array, abaikan saja.) Setelah input, array berisi angka-angka yang berbeda.
Berikut adalah contoh run programnya :
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct numbers is 6
The distinct numbers are: 1 2 3 6 4 5
 */