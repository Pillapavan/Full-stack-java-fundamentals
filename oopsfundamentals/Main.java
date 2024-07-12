package com.java.oopsfundamentals;

public class Main {
    public static void main(String[] args) {
//instance variables have default values
        Student student=new Student();
        System.out.println("student Name:"+student.Name);
        System.out.println("student Age:"+student.Age);
        System.out.println("Student Rollnumber:"+student.rollNumber);
        System.out.println("student Grade:"+student.Grade);
        System.out.println("Student college:"+student.College);

        System.out.println();

        Student student1=new Student();
        student1.Name="pavan";
        student1.Age=20;
        student1.rollNumber=45;
        student1.College="kiet";
        student1.Grade='A';
        System.out.println("student Name:"+student1.Name);
        System.out.println("student Age:"+student1.Age);
        System.out.println("Student Rollnumber:"+student1.rollNumber);
        System.out.println("student Grade:"+student1.Grade);
        System.out.println("Student college:"+student1.College);
    }
}
