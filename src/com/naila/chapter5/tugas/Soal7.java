package com.naila.chapter5.tugas;

public class Soal7 {
    public static void main(String[] args) {
        int totalCost = 0 ;
        int tuition = 10000;
        int tuitionTenthYear =  0;

        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.050);
            if (year > 10)
                totalCost += tuition;
            if (year == 10)
                tuitionTenthYear = tuition;
        }
        System.out.println("Tuition in ten years: $" + tuitionTenthYear) ;
        System.out.println("Total cost for four years' worth of tuition" + " after the tenth year: $" + totalCost) ;
    }
}

/* (Financial application: compute future tuition) Suppose the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year.

 */