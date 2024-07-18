package com.java.oopsfeatures.Encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();

        student.setAge(40);
        student.setName("mahesh");
        student.setGrade(7.0);

        student.displayInfo();

        student.setGrade(6.9);
        student.displayInfo();
    }
}
