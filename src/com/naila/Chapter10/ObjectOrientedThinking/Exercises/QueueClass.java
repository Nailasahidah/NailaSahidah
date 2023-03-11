package com.naila.Chapter10.ObjectOrientedThinking.Exercises;

public class QueueClass {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <=20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.println(queue.dequeue() + " ");
        }
        System.out.println();
    }
}

/*
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
 */