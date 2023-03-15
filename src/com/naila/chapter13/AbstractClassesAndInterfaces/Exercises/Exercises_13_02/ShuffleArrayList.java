package com.naila.chapter13.AbstractClassesAndInterfaces.Exercises.Exercises_13_02;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.3);
        list.add(3);
        list.add(4.6);
        list.add(5);
        list.add(6.246);
        list.add(7.43);
        list.add(8);
        System.out.println(list.toString());
        shuffle(list);
    }
    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}

/*
[1, 2.3, 3, 4.6, 5, 6.246, 7.43, 8]
 */