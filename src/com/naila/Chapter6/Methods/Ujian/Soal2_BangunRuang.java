package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class Soal2_BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("pilih Bangun ruang : " + "\n1. Lingkaran " +
                "\n2. Balok" + "\n3. Prisma Segitiga" + "\n4. Hexagon" + "\n5. Pentagon");
        int answer = input.nextInt();

        switch (answer) {
            case 1 :
                System.out.print("Anda memilih bangun ruang:  Lingkaran");
                System.out.print("\nEnter the radius ang length of cylinder:");
                double radius = input.nextDouble();
                double length = input.nextDouble();
                double PI = 3.14159;
                System.out.println("The area is " + String.format("%.2f", area(radius, PI)));
                System.out.println("The volume is " + String.format("%.2f", volume (area(radius, PI), length))); break ;

            case 2 :
                System.out.print("Anda memilih bangun ruang: Balok");
                System.out.println("\nMasukan panjang, lebar, dan tinggi :");
                double panjang = input.nextDouble();
                double lebar = input.nextDouble();
                double tinggi = input.nextDouble();
                System.out.println("Volume balok adalah " + volumeBalok(panjang, lebar, tinggi) + " cm3" );
                System.out.println("Luas permukaan Balok adalah " + luasBalok(panjang, lebar) + " cm3"); break;

            case 3 :
                System.out.print("Anda memilih bangun ruang : Prisma Segitiga");
                System.out.print("\nMasukan alas segitiga : ");
                double alas = input.nextDouble();
                System.out.print("\nMasukan tinggi Segitiga : ");
                double tinggi1 = input.nextDouble();
                System.out.print("\nMasukan tinggi Prisma : ");
                double tinggi2 = input.nextDouble();
                double ks = 2 * Math.pow((Math.pow((alas / 2), 2) + Math.pow(tinggi1, 2)), 0.5)  + alas ;
                System.out.println("Volume Prisma segitiga adalah " + volumePrisma(alas, tinggi1, tinggi2));
                System.out.println("Luas permukaannya adalah " +
                        String.format("%.2f",luasPermukaan(alas, tinggi1, tinggi2, ks))); break ;
            case 4 :
                System.out.print("Anda memilih bangun ruang : Hexagon");
                System.out.print("\nEnter the length of the side: ");
                double side = input.nextDouble() ;
                System.out.println("The area of the hexagon is " + area(side));

            case 5 :
                System.out.print("Anda memilih bangun ruang : Pentagon");
                System.out.print("\nEnter the side: ");
                double sidePtgon = input.nextDouble();
                System.out.println("The area of the pentagon is " + areaPentagon(sidePtgon));
        }

    }

    public static double area (double radius, double PI) {

        return radius * radius * PI;
    }
    public  static double volume (double area, double length) {

        return area * length ;
    }
    public static double volumeBalok(double panjang, double lebar, double tinggi){

        return panjang * lebar * tinggi ;
    }
    public static double luasBalok (double panjang, double lebar) {

        return panjang * lebar;
    }
    public static double volumePrisma (double alas, double tinggi1, double tinggi2) {
        return (0.5 * alas * tinggi1) * tinggi2;
    }
    public static double luasPermukaan (double alas, double tinggi1, double tinggi2, double ks) {
        return (2 * 1 / 2 * alas * tinggi1) + (ks * tinggi2);
    }
    public static double area (double side) {
        return ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2) ;
    }
    public static double areaPentagon(double sidePtgon) {
        return (5 * Math.pow(sidePtgon, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
