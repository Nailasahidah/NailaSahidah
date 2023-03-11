package com.naila.Chapter10.ObjectOrientedThinking.Exercises;

public class CourseClass {
    public static void main(String[] args) {
        Course math101 = new Course("math101") ;

        math101.addStudent("Mark");
        math101.addStudent("Tom");
        math101.addStudent("Joan");

        math101.dropStudent("Tom");

        System.out.println("\nThe students in the course " + math101.getCourseName() + ":");
        String[] students = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {
            System.out.println(students[i] + " ");
        }
        System.out.println();
    }
}


/*
The students in the course math101:
Mark
Joan
 */