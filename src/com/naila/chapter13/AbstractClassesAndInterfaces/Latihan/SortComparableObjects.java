package com.naila.chapter13.AbstractClassesAndInterfaces.Latihan;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city : cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"), new BigInteger("4322323233239292"), new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers)
            System.out.print(number + " ");
    }
}

/*
Atlanta Boston Savannah Tampa
54623239292 2323231092923992 4322323233239292
Process finished with exit code 0
 */