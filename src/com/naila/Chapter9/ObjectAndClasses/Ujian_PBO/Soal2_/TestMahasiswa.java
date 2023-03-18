package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal2_;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setName("Naila");
        mhs.setNim(200433);
        mhs.setJurusan("Teknik Informatika");

        System.out.println("Nama Mahasiswa: " + mhs.getName());
        System.out.println("NIM Mahasiswa: " + mhs.getNim());
        System.out.println("Jurusan Mahasiswa: " + mhs.getJurusan());
    }
}
