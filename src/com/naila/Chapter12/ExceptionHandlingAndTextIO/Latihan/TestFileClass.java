package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("Does it exits? " + file.exists());
        System.out.println("The file has " + file.length());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
    }
}


/*
Does it //exits? false
The file has 0
Can it be read? false
Can it be written? false
Is it a directory? false
Is it a file? false
Is it absolute? false
Is it hidden? false
Absolute path is C:\Users\LAB 2B-06\IdeaProjects\NailaSahidah\image\//us.gif
Last modified on Wed Dec 31 16:00:00 PST 1969
 */