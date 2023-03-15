package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

import java.util.ArrayList;
import java.util.Date;

public class Exercises6 {
    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList<Object>();
        o.add(new Loan());
        o.add(new Date());
        o.add(new String("String class"));
        o.add(new Circle());

        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }
    }
}

/*
com.naila.Chapter11.InheritanceAndPolymorphism.Exercises.Loan@568db2f2
Tue Mar 14 20:52:17 PDT 2023
String class
com.naila.Chapter11.InheritanceAndPolymorphism.Exercises.Circle@4fca772d
 */