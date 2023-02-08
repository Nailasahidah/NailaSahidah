package com.naila.Chapter7.SingleDimensionalArrays.Latihan;

public class Listing1_AnalyzeNumbers_MenganalisisAngka {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}


/*membaca 100 angka, rata-ratanya dan jumlah item yang lebih besar dari rata-rata
Enter the number of items: 10
        Enter the numbers: 3.4 5 6 1 6.5 7.8 3.5 8.5 6.3 9.5
        Average is 5.75
        Number of elements above the average is 6

 */