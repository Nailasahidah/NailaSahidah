package com.naila.chapter2.ElementaryProgramming.Ujian;
import java.util.Scanner ;
public class Soal1VolumeDanLuasPrismaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter alas segitiga: ") ;
        double as = input.nextDouble() ;
        System.out.print("Enter tinggi segitiga: ") ;
        double ts = input.nextDouble() ;
        System.out.print("Enter tinggi prisma:") ;
        double tp = input.nextDouble() ;

        double ks = 2 * Math.pow((Math.pow((as / 2), 2) + Math.pow(ts, 2)), 0.5)  + as ;
        double volume = (0.5 * as * ts) * tp ;
        double luasPermukaan = (2 * 1 / 2 * as * ts) + (ks * tp) ;

        System.out.println("Volume prisma segitiga sama kaki adalah " + volume + " dan Luas permukaannya adalah " + String.format("%.2f",luasPermukaan)) ;
    }
}
