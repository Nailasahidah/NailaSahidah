package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal1_ClassAndObject;

public class Object_Person {
    public static void main(String[] args) {
        // Call class Person
        Person person1 = new Person(); // penggunaan kata kunci new
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "Naila Sahidah";
        person1.Status = "Mahasiswa";
        person1.address = "Majalengka";

        // Result
        System.out.println(person1.name);
        System.out.println(person1.Status);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
