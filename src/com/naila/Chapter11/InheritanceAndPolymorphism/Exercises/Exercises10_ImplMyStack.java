package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

import com.naila.Chapter11.InheritanceAndPolymorphism.Latihan.MyStack;

import java.util.Scanner;

public class Exercises10_ImplMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        System.out.println("Stack: " + stack.toString());
    }
}

/*
Enter five strings: 1 2 3 4 5
Stack: stack: [1, 2, 3, 4, 5]
 */