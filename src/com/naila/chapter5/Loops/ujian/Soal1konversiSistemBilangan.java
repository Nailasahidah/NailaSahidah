package com.naila.chapter5.Loops.ujian;

import java.util.Scanner;

public class Soal1konversiSistemBilangan {
    public static void main(String[] args) {
        System.out.print("============= MENU KONVERSI ===========");

        String set1 = "Biner To Oktal" ;
        String set2 = "Biner To Decimal" ;
        String set3 = "Biner To Heksa" ;
        String set4 = "Oktal To Biner" ;
        String set5 = "Oktal To Decimal" ;
        String set6 = "Oktal to Heksa" ;
        String set7 = "Decimal To Biner" ;
        String set8 = "Decimal To Oktal" ;
        String set9 = "Decimal To Heksa" ;
        String set10 = "Heksa To Biner" ;
        String set11 = "Heksa To Oktal" ;
        String set12 = "Heksa To Decimal" ;
        int amount = 0;

        Scanner input = new Scanner(System.in) ;
        System.out.print("\n1 " +set1 + "\n2 " + set2 + "\n3 " + set3 + "\n4 " + set4 + "\n5 " + set5 + "\n6 " + set6 +
                "\n7 " + set7 + "\n8 " + set8 + "\n9 " + set9 + "\n10 " + set10 + "\n11 " + set11 + "\n12 " + set12);

        System.out.print("\nKonversikan ke- ");
        int answer = input.nextInt() ;

        switch (answer) {
            case 1:
                System.out.print("Anda mengkonversi Bilangan Biner ke Oktal");
                Scanner scan8 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Biner : ");
                int num8 = Integer.parseInt(scan8.nextLine(), 2);
                String biner6 = Integer.toOctalString(num8) ;
                System.out.println(" Nilai oktal nya Adalah " + biner6); break ;

                /*
                System.out.print("Anda mengkonversi Bilangan Biner ke Oktal");
                System.out.print("\nMasukan Bilangan Biner : ");
                int binr = input.nextInt();
                    System.out.print("Angka oktal dari biner " + binr);
                    int p, bilanganOktal = 0;
                   int desimalNumber = 0;

                    for (p = 1; binr != 0; binr = binr / 10, p = p * 2) {
                       desimalNumber = (int) (desimalNumber + (binr % 10) * p);
                    }
                    for (p = 1; desimalNumber != 0; p = p * 10) {
                        bilanganOktal = bilanganOktal + (desimalNumber % 8) * p;
                        desimalNumber = desimalNumber / 8;
                        System.out.println(" Adalah : " + bilanganOktal);break;
                         //10101011 ---253
                    }
                    */

            case 2 :
                /*
                System.out.print("Anda Mengkonversi Bilangan Biner ke Desimal");
                Scanner scana = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Biner : ");
                int numa = Integer.parseInt(scana.nextLine(),2);
                String biner8 = Integer.toString(numa);
                System.out.println("Nilai desimalnya Adalah " + biner8); break ;
                 */
                 System.out.print("Anda Mengkonversi Bilangan Biner ke Desimal");
                 System.out.print("\nMasukan Bilangan Biner : ");
                 int angkaBiner = input.nextInt() ;
                 int angkaDesimal =0 ;
                 int i = 1;
                 int digit ;
                 System.out.print("Angka desimal dari biner " + angkaBiner);
                 while (angkaBiner !=0) {
                    digit = angkaBiner %10 ;
                    angkaDesimal = angkaDesimal + (digit * i) ;
                    i = i * 2 ;
                    angkaBiner =angkaBiner/10;
                 }
                 System.out.println(" Nilai desimalnya Adalah : " + angkaDesimal) ; break; //110101 ---53

            case 3 :
                System.out.print("Anda Mengkonversi Bilangan Biner ke Heksa"); // 10101011--- AB
                Scanner scan1 = new Scanner(System.in);
                System.out.print("\nMasukan Bilangan Biner : ") ;
                int num1 = Integer.parseInt(scan1.nextLine(), 2) ;
                String heksa1 = Integer.toHexString(num1) ;
                System.out.println("Angka heksa dari bilanagn biner " + num1 + " Adalah " + heksa1); break ;

            case 4 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Biner"); //71 ---111001
                Scanner scan5 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num5 = Integer.parseInt(scan5.nextLine(), 8);
                String biner5 = Integer.toBinaryString(num5);
                System.out.println("Adalah " + biner5); break;

                /*int nilaiOktal = input.nextInt() ;
                System.out.println("Angka Biner dari Oktal " + nilaiOktal);
                String bilbiner = "";
                for (int a = nilaiOktal; a > 0; a /= 2) {
                    bilbiner = (a % 2) + bilbiner;
                }
                System.out.print(" Adalah : " + bilbiner); break ;

                 */

            case 5 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Desimal");
                Scanner scan7 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num4 = Integer.parseInt(scan7.nextLine(), 8);
                String oktal4 = Integer.toString(num4);
                System.out.println("Adalah " + oktal4); break ;

                /*int angkaOktal = input.nextInt() ;
                int angkaDesi = 0 ;
                int t = 1;
                int dig ;
                System.out.print("Angka desimal dari oktal " + angkaOktal);
                while (angkaOktal !=0) {
                    dig = angkaOktal %10 ;
                    angkaDesi = angkaDesi + (dig * t) ;
                    t = t * 8 ;
                    angkaOktal =angkaOktal/10;
                }
                System.out.println(" Adalah : " + angkaDesi) ; break; //371 ---249

                 */

            case 6 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Heksa"); //243 ---A3
                Scanner scan3 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num3 = Integer.parseInt(scan3.nextLine(),8);
                String oktal3 = Integer.toHexString(num3);
                System.out.println("Adalah " + oktal3); break ;

            case 7 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Biner");
                System.out.print("\nMasukan Bilangan Desimal : ");
                int desimal = input.nextInt() ;
                System.out.print("Angka Biner dari desimal " + desimal);
                String biner = "";
                for (int a = desimal; a > 0; a /= 2) {
                    biner = (a % 2) + biner;
                }
                System.out.println(" Adalah : " + biner); break ; //89 ---1011001

            case 8 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Oktal");
                System.out.print("\nMasukan Bilangan Desimal : ");
                int desi = input.nextInt();
                System.out.print("Angka Oktal dari desimal " + desi);
                String oktal = "";
                for (int u = desi; u > 0; u /= 8) {
                    oktal = u % 8 + oktal;
                }
                System.out.println(" Adalah : " + oktal); break ; //147 --- 223

            case 9 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Heksa");
                System.out.print("\nMasukan Bilangan Desimal : ");
                int mal = input.nextInt() ;
                System.out.print("Angka Heksa dari desimal " + mal );
                String heksa = "";
                while ( mal != 0){
                    int nilaiheksa = mal % 16 ;
                    char heksaDigit = (nilaiheksa <= 9 && nilaiheksa >= 0) ?
                            (char)(nilaiheksa + '0') : (char)(nilaiheksa - 10 + 'A') ;
                    heksa = heksaDigit + heksa ;
                    mal = mal / 16 ;
                }
                System.out.print(" Adalah : " + heksa); break ; //123 --- 7B

            case 10 :
                System.out.print("Anda Mengkonversi Bilangan Heksa ke Biner"); // 8F ---- 10001111
                Scanner scan4 = new Scanner(System.in) ;
                System.out.print("\nMasukan nilai Heksa : ") ;
                int num7 = Integer.parseInt(scan4.nextLine(),16);
                String biner1 = Integer.toBinaryString(num7);
                System.out.println("Adalah " + biner1); break ;

            case 11 :
                System.out.print("Anda Mengkonversi Bilangan Heksa ke Oktal"); //8F ---- 217

                /*int bihe = input.nextInt() ;
                int otal = 0;
               char[] daftarOktal = {'0','1','2','3','4','5','6','7'} ;
                if (bihe > 0){
                    otal =(bihe/8);
                    System.out.print(daftarOktal[bihe%8]);
                }
                */
                Scanner scan2 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Heksa : ");
                int num2 = Integer .parseInt(scan2.nextLine(), 16) ;
                String oktal2 = Integer.toOctalString(num2) ;
                System.out.println("Adalah " + oktal2); break ;

            case 12 :
                System.out.print("Anda Mengkonversi Bilangan Heksa ke Desimal"); //8F --- 143
                Scanner scan6 =new Scanner(System.in) ;                            // 6C --- 108
                System.out.print("\nMasukan Bilangan Heksa : ");
                int num6 = Integer.parseInt(scan6.nextLine(), 16);
                String desimal1 = Integer.toString(num6);
                System.out.println("Adalah " + desimal1);

                /*long angkaHeksa = input.nextInt() ;
                int angkamal =0 ;
                int r = 1;
                int digt ;

                System.out.print("Angka desimal dari Heksa " + angkaHeksa);
                while (angkaHeksa !=0) {
                    digt = (int)(angkaHeksa %10) ;
                    angkamal = angkamal + (digt * r) ;
                    r = r * 16 ;
                    angkaHeksa =angkaHeksa/10;
                }
                System.out.println(" Adalah : " + angkamal) ; break;

                 */
        }
    }
}
