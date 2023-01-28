package com.naila.Chapter6.Methods.Ujian;

import java.util.Scanner;

public class Soal3_KonversiBilanganMethod {
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
        int answer = input.nextInt();

        switch (answer) {
            case 1:
                System.out.print("Anda mengkonversi Bilangan Biner ke Oktal");
                Scanner scan8 = new Scanner(System.in);
                System.out.print("\nMasukan Bilangan Biner : ");
                int num = Integer.parseInt(scan8.nextLine(), 2);
                System.out.println("Angka oktalnya adalah : " + biner(num)); break ;

            case 2 :
                System.out.print("Anda Mengkonversi Bilangan Biner ke Desimal");
                Scanner scana = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Biner : ");
                int numa = Integer.parseInt(scana.nextLine(),2);
                System.out.println(" Nilai desimalnya Adalah : " + biner8(numa)) ; break;
            case 3 :
                System.out.print("Anda Mengkonversi Bilangan Biner ke Heksa"); // 10101011--- AB
                Scanner scan1 = new Scanner(System.in);
                System.out.print("\nMasukan Bilangan Biner : ") ;
                int num1 = Integer.parseInt(scan1.nextLine(), 2) ;
                System.out.println("Angka heksanya Adalah " + heksa1(num1)); break ;
            case 4 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Biner"); //71 ---111001
                Scanner scan5 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num5 = Integer.parseInt(scan5.nextLine(), 8);
                System.out.println("Angka binernya Adalah " + biner5(num5)); break;
            case 5 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Desimal");
                Scanner scan7 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num4 = Integer.parseInt(scan7.nextLine(), 8);
                System.out.println("Angka desimalnya Adalah " + oktal4(num4)); break ;
            case 6 :
                System.out.print("Anda Mengkonversi Bilangan Oktal ke Heksa"); //243 ---A3
                Scanner scan3 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Oktal : ");
                int num3 = Integer.parseInt(scan3.nextLine(),8);
                System.out.println("Nilai heksanya Adalah " + oktal3(num3)); break ;
            case 7 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Biner");
                Scanner scan0 = new Scanner(System.in);
                System.out.print("\nMasukan Bilangan Desimal : ");
                int num9 = Integer.parseInt(scan0.nextLine(), 10) ;
                String desimal = Integer.toBinaryString(num9) ;
                System.out.println("Nilai binernya Adalah : " + desimal(num9)); break ; //89 ---1011001
            case 8 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Oktal");
                Scanner scan10 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Desimal : ");
                int num10 = Integer.parseInt(scan10.nextLine(), 10) ;
                String desimal10 = Integer.toOctalString(num10) ;
                System.out.println("Nilai oktalnya Adalah : " + desimal10(num10)); break ; //147 --- 223
            case 9 :
                System.out.print("Anda Mengkonversi Bilangan Desimal ke Heksa");
                Scanner scan11 = new Scanner(System.in) ;
                System.out.print("\nMasukan Bilangan Desimal : ");
                int num11 = Integer.parseInt(scan11.nextLine(), 10) ;
                String desimal11 = Integer.toHexString(num11) ;
                System.out.print("Nilai heksanya Adalah : " + desimal11(num11)); break ; //123 --- 7B
            case 10 :
                System.out.print("Anda Mengkonversi Bilangan Heksa ke Biner"); // 8F ---- 10001111
                Scanner scan4 = new Scanner(System.in) ;
                System.out.print("\nMasukan nilai Heksa : ") ;
                int num7 = Integer.parseInt(scan4.nextLine(),16);
                System.out.println("Nilai binernya Adalah " + biner2(num7)); break ;
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
                System.out.println("Nilai oktalnya Adalah " + oktal2(num2)); break ;
            case 12 :
                System.out.print("Anda Mengkonversi Bilangan Heksa ke Desimal"); //8F --- 143
                Scanner scan6 =new Scanner(System.in) ;                            // 6C --- 108
                System.out.print("\nMasukan Bilangan Heksa : ");
                int num6 = Integer.parseInt(scan6.nextLine(), 16);
                System.out.println("Nilai desimalnya Adalah " + desimal1(num6));


        }
    }
    public static String biner(int num){                //1
        return Integer.toOctalString(num) ;
    }
    public static String biner8(int numa){              //2
        return Integer.toString(numa);
    }
    public static String heksa1 (int num1){             //3
        return Integer.toHexString(num1) ;
    }
    public static String biner5(int num5) {             //4
        return Integer.toBinaryString(num5);
    }
    public static String oktal4 (int num4) {             //5
        return Integer.toString(num4);
    }
    public static String oktal3 (int num3) {             //6
        return Integer.toHexString(num3);
    }
    public static String desimal(int num9){              //7
        return Integer.toBinaryString(num9);
    }
    public static String desimal10(int num10){          //8
       return Integer.toOctalString(num10) ;
    }
    public static String desimal11 (int num11){         //9
        return Integer.toHexString(num11) ;
    }
    public static String  biner2( int num7) {           //10
        return Integer.toBinaryString(num7);
    }
    public static String oktal2 (int num2){             //11
        return Integer.toOctalString(num2) ;
    }
    public static String desimal1 (int num6) {           //12
        return Integer.toString(num6);
    }
}
