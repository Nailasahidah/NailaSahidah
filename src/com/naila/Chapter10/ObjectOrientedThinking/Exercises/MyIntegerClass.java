//package com.naila.Chapter10.ObjectOrientedThinking.Exercises;
//
//public class MyIntegerClass {
//    public static void main(String[] args) {
//        int[] values = {5, 6, 7, 8, 9};
//
//        System.out.println("\nTest if values are even using isEven(int): ");
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
//        }
//        System.out.println("\nTest if values are odd using isOdd(int):");
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
//        }
//        System.out.println("\nTest if values are prime using isPrime(int):");
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
//        }
//        System.out.println("\nTest if values are odd using isOdd():");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isOdd());
//        }
//        System.out.println("\nTest if values are even using isEven():");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isEven());
//        }
//        System.out.println("\nTest if values are prime using isPrime():");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isPrime());
//        }
//        System.out.println("\nTest if values are even using isEven(MyInteger):");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isEven(value));
//        }
//        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isOdd(value));
//        }
//        System.out.println("\nTest if values are prime using isPrime(MyInteger):");
//        for (int i = 0; i < values.length; i++) {
//            MyInteger value = new MyInteger(values[i]);
//            System.out.println(value.getValue() + " " + value.isPrime(value.getValue()));
//        }
//
//        int[] values2 = {5, 9, 7};
//        MyInteger value = new MyInteger(9);
//        System.out.println("\nTest if " + value.getValue() + " is equal to the specified value:");
//        for (int i = 0; i < values2.length; i++) {
//            System.out.println(values2[i] + " " + value.equals(values2[i]));
//        }
//        System.out.println("\nTest if " + value.getValue() + " is equal to the specified value:");
//        for (int i = 0; i < values2.length; i++) {
//            System.out.println(values2[i] + " " + value.equals(MyInteger));
//        }
//        System.out.println("\nTest parseInt(char[]) and parseInt(String):");
//        char[] numericCharacters = {'3', '4', '2'};
//
//        String numericString = "658";
//        System.out.print("\'");
//        for (int i = 0; i < numericCharacters.length; i++) {
//            System.out.print(numericCharacters[i] + "");
//        }
//        System.out.println("\' + \"" + numericString + "\" + " + (MyInteger.parseInt(numericCharacters) + MyInteger.parseInt(numericString)));
//    }
//}
