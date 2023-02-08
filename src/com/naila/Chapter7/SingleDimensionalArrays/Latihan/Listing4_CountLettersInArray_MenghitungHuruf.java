package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

import com.naila.Chapter6.Methods.Latihan.Listing10RandomCharacter;

public class Listing4_CountLettersInArray_MenghitungHuruf {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++)
        chars[i] = Listing10RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++){
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
}


/*
Program yang diberikan pada Listing 7.4 melakukan hal berikut:
1. Menghasilkan 100 huruf kecil secara acak dan menugaskannya ke array karakter.
Anda bisa mendapatkan huruf acak dengan menggunakan metode getRandomLowerCaseLetter() di kelas RandomCharacter di Listing 6.10.
2. Hitung kemunculan setiap huruf dalam larik. Untuk melakukannya, buat larik, misalnya hitungan, dari 26 nilai int,
yang masing-masing menghitung kemunculan huruf.
Artinya, counts[0] menghitung jumlah a, counts[1] menghitung jumlah b, dan seterusnya.

The lowercase letters are:
s z g c t x y j v r a g t x e l o t j f
q n j b v x s a a v f z n h y h p d l b
x m b o z v a w o z l i q x a h g b j s
o h f o w j f q m b h r m c o y k b a b
u u m j l g h y z f y v k l i m l l f p

The occurrences of each letter are:
6 a 7 b 2 c 1 d 1 e 6 f 4 g 6 h 2 i 6 j
2 k 7 l 5 m 2 n 6 o 2 p 3 q 2 r 3 s 3 t
2 u 5 v 2 w 5 x 5 y 5 z
 */