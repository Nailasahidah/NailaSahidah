package com.naila.chapter1.JavaProgram.Exercises;

public class Soal11PopulationProjection {
    public static void main(String[] strings) {
        double birthRateInSeconds = 7.0 ;
        double deathRateInSeconds = 13.0 ;
        double newImmigrantInSeconds = 45.0 ;


        double currentPopulation = 312032486 ;

        double secondsInYears = 60 * 60 * 40 * 365 ;

        double numBirths = secondsInYears / birthRateInSeconds ;
        double numDeaths = secondsInYears / deathRateInSeconds ;
        double numImmigrants = secondsInYears / newImmigrantInSeconds ;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths = numImmigrants - numDeaths ;
            System.out.println("Year " + i + " = " + (int)currentPopulation) ;

        }


    }
}

// (Proyeksi populasi) Biro Sensus AS memproyeksikan populasi berdasarkan asumsi berikut:
// Satu kelahiran setiap 7 detik
// Satu kematian setiap 13 detik
// Satu imigran baru setiap 45 detik
// Buatlah program untuk menampilkan jumlah penduduk setiap lima tahun ke depan. Menganggap
// bahwa jumlah penduduk saat ini adalah 312.032.486, dan satu tahun terdiri dari 365 hari.
// Petunjuk:
// Di Jawa, jika dua bilangan bulat melakukan pembagian, hasilnya adalah bilangan bulat. Bagian pecahan dipotong.
// Misalnya, 5/4 adalah 1 (bukan 1,25) dan 10/4 adalah 2 (bukan 2,5).
// Untuk mendapatkan hasil yang akurat dengan bagian pecahan, salah satu nilai yang terlibat dalam pembagian harus
// angka dengan titik desimal. Misalnya, 5,0 / 4 adalah 1,25 dan 10 / 4,0 adalah 2,5.
//
// Year 1 = 309157409
// Year 2 = 306282332
// Year 3 = 303407255
// Year 4 = 300532178
// Year 5 = 297657101