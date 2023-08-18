package com.naila.chapter1.JavaProgram.Exercises;

public class Soal10AverageSpeedInMiles {
    public static void main(String[] strings) {
        double kilometers = 14.0 ;
        double miles = kilometers / 1.6 ;

        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0) ;
        double milesPerHour = miles / rate ;

        System.out.println(milesPerHour) ;
    }
}

// (Kecepatan rata-rata dalam mil) Asumsikan seorang pelari berlari sejauh 14 kilometer
// dalam 45 menit dan 30 detik. Tulis program yang menampilkan kecepatan rata-rata dalam mil per
// jam. (Catatan 1 mil sama dengan 1,6 kilometer.)

// 11.41304347826087