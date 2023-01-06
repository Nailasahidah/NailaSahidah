package com.naila.chapter4;



public class fungsi {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = hitung(x);

        System.out.print("x = " + x + "y = " + y);
    }

        static int hitung (int input) {
            int hasil ;

          hasil = (input + 2) * input ;

         return hasil ;
    }
}
