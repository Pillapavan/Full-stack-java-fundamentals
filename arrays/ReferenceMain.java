package com.java.arrays;

import java.util.Locale;

public class ReferenceMain {
    public static void main(String[] args) {
        ReferenceArrays Student1= new ReferenceArrays("pavan", (byte) 18,45);
        ReferenceArrays Student2= new ReferenceArrays("praveen", (byte) 17,56);
        ReferenceArrays Student3= new ReferenceArrays("tataji", (byte) 19,34);

        //Array Initializing
        ReferenceArrays[] Students;
        Students=new ReferenceArrays[3];
        Students[0]=Student1;
        Students[1]=Student2;
        Students[2]=Student3;

        //Accessing Reference Array
        for(ReferenceArrays Student:Students) {
            Student.Name=Student.Name.toUpperCase();
            Student.displayInfo();
        }

    }
}
