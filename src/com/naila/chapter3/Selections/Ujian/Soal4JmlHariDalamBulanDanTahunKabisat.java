package com.naila.chapter3.Selections.Ujian;
import java.util.Scanner ;
public class Soal4JmlHariDalamBulanDanTahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Masukan Nama Bulan dalam Bahasa Indonesia: ") ;
        String bulan = input.nextLine() ;
        System.out.println("Masukan Tahun : ") ;
        int tahun = input.nextInt() ;

        System.out.print("Pada bulan " + bulan + " Tahun " + tahun + " ada") ;
        switch (bulan) {
            case "januari":
            case "maret" :
            case "mei" :
            case "juli" :
            case "agustus" :
            case "oktober" :
            case "desember" :
                System.out.println(" 31 hari,");break ;
            case "april" :
            case "juni" :
            case "september" :
            case "november" :
                System.out.println(" 30 hari,"); break ;
            case "februari" :
                if (tahun % 400 ==0){
                    System.out.println(" 29 hari,");
                }
                else if ((tahun % 400 != 0) && (tahun % 100 == 0)){
                    System.out.println(" 28 hari,");
                }
                else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)){
                    System.out.println(" 29 hari,");
                }
                else {
                    System.out.println(" 28 hari,");
                }
        }
        if ( tahun % 400 == 0) {
            System.out.print( "Tahun ini merupakan tahun kabisat") ;
        }
        else if (tahun % 100 == 0){
            System.out.print( "Tahun ini bukan merupakan tahun kabisat") ;
        }
        else if (tahun % 4 == 0) {
            System.out.print( "Tahun ini merupakan tahun kabisat") ;
        }
        else{
            System.out.print( "Tahun ini bukan merupakan tahun kabisat");
        }


    }
}
