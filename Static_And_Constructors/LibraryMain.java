package com.java.Static_And_Constructors;

public class LibraryMain {
    public static void main(String[] args) {
        //creating reference variable
        Library Object1;
        //invoke default constructor
        Object1=new Library();
        //invoke displayBookInfo
        Object1.displayBookInfo();

        System.out.println();

        //creating another object for parameterized constructor
        Library Object2;
        Object2=new Library("The Last Thing he Told ME","Laure Dave");
        //invoking Method
        Object2.displayBookInfo();

        //invoking static method
        Library.getLibraryName();



    }

}
