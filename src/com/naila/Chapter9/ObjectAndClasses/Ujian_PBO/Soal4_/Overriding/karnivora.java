package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal4_.Overriding;

public class karnivora extends Hewan {
    String jenis = "Sapi";
    int umur = 4;
    public static void main(String[] args) {
        karnivora data = new karnivora();
        System.out.println("Jenis Hewan: "
                + data.getJenis());
        System.out.println("Usia Hewan: "
                + data.getUmur());
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public int getUmur() {
        return umur;
    }
}
