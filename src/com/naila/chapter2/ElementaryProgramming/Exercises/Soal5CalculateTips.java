package com.naila.chapter2.ElementaryProgramming.Exercises;
import java.util.Scanner ;
public class Soal5CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the subtotal and a gratuity rate:") ;
        double subtotal = input.nextDouble() ;
        double gratuityRate = input.nextDouble() ;

        double gratuity = subtotal * (gratuityRate / 100) ;
        double total = subtotal + gratuity ;

        System.out.println("The gratuity is $ " + gratuity + " and total is $ " + total) ;
    }
}

//(Aplikasi keuangan: tip hitung) Tulis program yang membaca subtotal
//dan tingkat gratifikasi, kemudian dihitung gratifikasi dan totalnya. Misalnya, jika
//pengguna memasukkan 10 untuk subtotal dan 15% untuk persen, program menampilkan $1,5
//sebagai gratifikasi dan $11,5 sebagai total. Berikut adalah contoh menjalankan:
//Enter the subtotal and a gratuity rate:10 15
//The gratuity is $ 1.5 and total is $ 11.5