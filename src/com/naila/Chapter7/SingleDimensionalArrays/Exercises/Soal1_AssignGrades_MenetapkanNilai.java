package com.naila.Chapter7.SingleDimensionalArrays.Exercises;

import java.util.Scanner;

public class Soal1_AssignGrades_MenetapkanNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()] ;
        char[] grades = new char[scores.length] ;

        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        getGrades(scores, grades);

        for (int i =  0; i < scores.length; i++) {
            System.out.println("Student " + i + " scores is " +
                    scores[i] + " and grade is " + grades[i]);
        }
    }
    public static int max(int[] array) {
        int max = array[0] ;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i] ;
        }
        return max;
    }
    public static void getGrades(int[] scores, char[] grades) {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= best - 10)
                grades[i] = 'A';
            else if (scores[i] >= best - 20)
                grades[i] = 'B';
            else if (scores[i] >= best - 30)
                grades[i] = 'C';
            else if (scores[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
    }
}


/*
(Menetapkan nilai) Tulis program yang membaca nilai siswa, mendapat nilai terbaik, dan
kemudian memberikan nilai berdasarkan skema berikut:
Grade adalah A jika skor Ú terbaik -10;
Nilai adalah B jika skor Ú terbaik -20;
Nilai C jika skor Ú terbaik -30;
Nilai adalah D jika skor Ú terbaik -40;
Grade adalah F sebaliknya.
 Program meminta pengguna untuk memasukkan jumlah total siswa, lalu meminta
pengguna untuk memasukkan semua skor, dan diakhiri dengan menampilkan nilai. Di sini adalah
contoh lari:
 */