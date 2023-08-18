package com.naila.chapter1.JavaProgram.Ujian;

public class Soal4KecepatanRataRata {
    public static void main(String[] strings) {
        double hours = 2 ;
        double minutes = 30 ;
        double seconds = 45 ;
        double distanceInMiles = 50 ;

        double distanceInKilometers = distanceInMiles * 1.6;
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0 ;
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes ;

        System.out.println("Miles / (Hour + (minutes / 60) + (second / 3600.0) * 1.6") ;
        System.out.println("50.0  / (2    + (30      / 60) + (45     / 3600.0) * 1.6") ;
        System.out.println("Kecepatan rata-rata dalam kilometer per jam adalah " +
                String.format("%.2f", kilometersPerHour) + " km/jam" ) ;
    }
}

// Miles / (Hour + (minutes / 60) + (second / 3600.0) * 1.6
// 50.0  / (2    + (30      / 60) + (45     / 3600.0) * 1.6
// Kecepatan rata-rata dalam kilometer per jam adalah 31.84 km/jam