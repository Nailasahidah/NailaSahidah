package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class Soal2_BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("pilih Bangun ruang : " + "\n1. Tabung " +
                "\n2. Balok" + "\n3. Bola" + "\n4. Kerucut" + "\n5. Kubus");
        int answer = input.nextInt();
        System.out.print("Anda memilih bangun ruang ");
        switch (answer) {
            case 1 :
                System.out.print("Tabung");
                System.out.print("\nMasukkan jari-jari alas lingkaran :");
                double r1 = input.nextDouble();
                System.out.print("Masukkan tinggi :");
                double t1 = input.nextDouble();
                double PI = 3.14159;
                System.out.println("Luas permukaan tabung adalah " + String.format("%.2f", luas1 ( PI, r1, t1)) + " cm2");
                System.out.println("Volume tabung adalah " + String.format("%.2f", volumeTabung (PI, r1, t1)) + "cm3"); break ;

            case 2 :
                System.out.print("Balok");
                System.out.println("\nMasukan panjang, lebar, dan tinggi :");
                double panjang = input.nextDouble();
                double lebar = input.nextDouble();
                double tinggi = input.nextDouble();
                System.out.println("Volume balok adalah " + String.format("%.2f",volumeBalok(panjang, lebar, tinggi)) + " cm3" );
                System.out.println("Luas permukaan Balok adalah " + String.format("%.2f", luasBalok (panjang, lebar, tinggi)) + " cm2"); break;

            case 3 :
                System.out.print("Bola");
                System.out.print("\nMasukan jari-jari : ");
                double r2 = input.nextDouble();
                double PI2 = 3.14159;
                System.out.println("Volume Bola adalah " + String.format("%.2f",volumeBola (r2,PI2)) + " cm3");
                System.out.println("Luas permukaannya adalah " + String.format("%.2f", luasBola (PI2, r2)) + " cm2"); break ;

            case 4 :
                System.out.print("Kerucut");
                System.out.print("\nMasukkan jari-jari alas lingkaran : ");
                double r = input.nextDouble() ;
                System.out.print("Masukkan tinggi : ");
                double t = input.nextDouble();
                System.out.print("Masukkan panjang garis apotema : ");
                double s = input.nextDouble() ;
                double PI1 = 3.14159;
                System.out.println("Volume kerucut adalah " + String.format("%.2f", volumeKerucut (r, t, PI1)) + " cm3");
                System.out.println("Luas permukaan kerucut adalah : " + String.format("%.2f", LuasKerucut ( PI1, r, s)) + " cm2"); break;

            case 5 :
                System.out.print("Kubus");
                System.out.print("\nMasukkan sisi / panjang rusuk : ");
                double s1 = input.nextDouble();
                System.out.println("Volume kubus adalah " + String.format("%.2f", volumeKubus (s1)) + " cm3");
                System.out.println("Luas permukaan kubus adalah : " + String.format("%.2f", luasKubus(s1)) + " cm2"); break;
        }
    }

    public static double luas1 (double PI, double r1 , double t1) {                     //1
        return 2 * PI * r1 * ( r1 + t1);
    }
    public  static double volumeTabung (double PI, double r1, double t1) {             //1
        return PI * r1 * r1 * t1 ;
    }
    public static double volumeBalok(double panjang, double lebar, double tinggi){    //2
        return panjang * lebar * tinggi ;
    }
    public static double luasBalok (double panjang, double lebar, double tinggi) {    //2

        return 2 * ((panjang* lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public static double volumeBola (double r2,double PI2) {                         //3
        return 4/3.0 * PI2* r2 * r2 * r2;
    }
    public static double luasBola (double PI2, double r2) {                          //3
        return 4 * PI2 * r2 * r2;
    }

    public static double volumeKerucut (double r, double t, double PI1) {            //4
        return 1/3.0 * PI1 * r * r * t ;
    }
    public static double LuasKerucut (double PI1, double r, double s){
        return PI1 * r * (r + s) ;
    }
    public static double luasKubus(double s1) {                                      //5
        return 6 * s1 * s1  ;
    }
    public static double volumeKubus (double s1) {
        return s1 * s1 * s1;
    }
}
