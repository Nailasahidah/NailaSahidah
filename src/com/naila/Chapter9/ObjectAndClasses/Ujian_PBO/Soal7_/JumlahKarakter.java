package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal7_;

import java.io.File;

public class JumlahKarakter {
    public static void main(String[] args) {
       File file = new File("file.txt");

        System.out.println(file);
        System.out.println("Jumlah karakter pada kalimat \"" + file + "\" adalah: " + file.length());

    }
}
