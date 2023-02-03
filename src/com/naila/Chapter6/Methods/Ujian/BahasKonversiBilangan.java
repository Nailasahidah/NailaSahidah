package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class BahasKonversiBilangan {
    public static void main(String[] args) {
        System.out.print("============= MENU KONVERSI  ===========");

        String set1 = "Biner To Oktal";
        String set2 = "Biner To Decimal";
        String set3 = "Biner To Heksa";
        String set4 = "Oktal To Biner";
        String set5 = "Oktal To Decimal";
        String set6 = "Oktal to Heksa";
        String set7 = "Decimal To Biner";
        String set8 = "Decimal To Oktal";
        String set9 = "Decimal To Heksa";
        String set10 = "Heksa To Biner";
        String set11 = "Heksa To Oktal";
        String set12 = "Heksa To Decimal";
        int amount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("\n1 " + set1 + "\n2 " + set2 + "\n3 " + set3 + "\n4 " + set4 + "\n5 " + set5 + "\n6 " + set6 +
                "\n7 " + set7 + "\n8 " + set8 + "\n9 " + set9 + "\n10 " + set10 + "\n11 " + set11 + "\n12 " + set12);

        System.out.print("\nKonversikan ke- ");
        int menu = input.nextInt();
        System.out.print("Anda mengkonversi Bilangan ");

        switch (menu){
            case 1 -> {

            }
        }
    }
}
