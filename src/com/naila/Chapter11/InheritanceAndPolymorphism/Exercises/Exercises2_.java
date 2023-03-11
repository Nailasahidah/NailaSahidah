package com.naila.Chapter11.InheritanceAndPolymorphism.Exercises;

public class Exercises2_ {
    public static void main(String[] args) {
        Person person = new Person("John", "12 Bell street",
                "3473339999", "john@aol.com");
        Student student = new Student("Mary", "100 Town Ave",
                "5149993333", "mary100@aol.com", Student.FRESHMAN);
        Employee employee = new Employee("Mike", "34 west street",
                "61899999", "mike80@aol.com", 910, 60000);
        Faculty faculty = new Faculty("Sue", "28 well street",
                "4133333333", "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");
        Staff staff = new Staff("Tom", "90 Country road", "203000000", "tomcat@aol.com", 12, 65000, "Executive Assistant");


        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

/*
Name: John
Address: 12 Bell street
Phone: 3473339999
Email address:john@aol.com

Name: Mary
Address: 100 Town Ave
Phone: 5149993333
Email address:mary100@aol.com
Status: freshman

Name: Mike
Address: 34 west street
Phone: 61899999
Email address:mike80@aol.com
Office: 910
Salary: $60000.00
Date hired: 01/00/0

Name: Sue
Address: 28 well street
Phone: 4133333333
Email address:sue28@aol.com
Office: 101
Salary: $50000.00
Date hired: 01/00/0
Office hours: 4pm to 6pm
Rank: Professor

Name: Tom
Address: 90 Country road
Phone: 203000000
Email address:tomcat@aol.com
Office: 12
Salary: $65000.00
Date hired: 01/00/0
Title: Executive Assistant

Process finished with exit code 0

 */