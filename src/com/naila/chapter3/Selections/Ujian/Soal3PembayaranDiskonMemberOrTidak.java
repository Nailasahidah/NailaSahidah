package com.naila.chapter3.Selections.Ujian;
import java.util.Scanner;
public class Soal3PembayaranDiskonMemberOrTidak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total,total_bayar,total_cash,kembalian,diskon;
        String member;

        System.out.println("Apakah pelanggan termasuk member? (Ya/Tidak)");
        member = input.nextLine();

        System.out.println("Masukan Total Belanja: ");
        total = input.nextInt();


        double a = 0.03 * total;
        double b = 0.02 * total;
        diskon = 0;

        switch (member) {
            case "ya": System.out.println("Anda merupakan : Member ");
                if (total >= 500000) {
                    diskon = a;
                }
                else
                    diskon = b;

                break;

            case "tidak" : System.out.println("Anda merupakan : Pelanggan biasa");
                if (total >= 500000) {
                    diskon = b;
                }
                else

                    break;

        }

        total_bayar = total - diskon;
        System.out.println("total belanja anda adalah : " + total);
        if (diskon == a)
            System.out.println("Selamat anda mendapatkan potongan harga : " + diskon);
        if (diskon == b)
            System.out.println("Selamat anda mendapatkan potongan harga : " + diskon);
        System.out.println("Total bayar :" +total_bayar);
        System.out.println(" ********* CASH SYSTEM *********");
        System.out.println("Total cash : ");
        total_cash = input.nextDouble();

        kembalian = total_cash - total_bayar;

        if ( total_cash >= total_bayar)
            System.out.println("Kembalian anda adalah :  " + kembalian );
        if ( total_cash < total_bayar)
            System.out.println("Maaf jumlah uang yang anda bayarkan kurang"  );



    }
}
