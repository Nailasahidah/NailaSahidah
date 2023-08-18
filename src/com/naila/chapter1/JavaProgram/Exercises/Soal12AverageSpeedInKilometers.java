package com.naila.chapter1.JavaProgram.Exercises;

public class Soal12AverageSpeedInKilometers {
    public static void main(String [] strings) {
        // making variables to hold current time and distance
        double hours = 1 ;
        double minutes =  40 ;
        double seconds = 35 ;
        double distanceInMiles = 24 ;

        // Converting from miles to kilometers
        // Note: the book said 1.6, however 1.60934 is more accurate
        double distanceInKilometers = distanceInMiles * 1.60934 ;

        // Converting current time (hour, minutes, seconds) into total amount of minutes
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0 ;

        // Calculating kilometers per hour
        // kph = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes ;

        System.out.println(kilometersPerHour) ;

    }
}

//(Kecepatan rata-rata dalam kilometer) Asumsikan seorang pelari berlari sejauh 24 mil dalam 1 jam, 40
//menit, dan 35 detik. Buatlah program yang menampilkan kecepatan rata-rata dalam
//kilometer per jam. (Catatan 1 mil sama dengan 1,6 kilometer.)

// 23.040095443247726