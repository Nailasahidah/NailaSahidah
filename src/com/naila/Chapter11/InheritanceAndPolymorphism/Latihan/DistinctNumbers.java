package com.naila.Chapter11.InheritanceAndPolymorphism.Latihan;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt() ;
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}


/*
Enter integers (input ends with 0): 1 2 3 2 1 6 3 4 5 4 5 1 2 3 0
The distinct integers are: 1 2 3 6 4 5
 */