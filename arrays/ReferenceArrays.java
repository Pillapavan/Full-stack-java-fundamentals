package com.java.arrays;

public class ReferenceArrays {
    String Name;
    byte Age;
    int rollNumber;

    ReferenceArrays(String Name, byte Age, int rollNumber){
        this.Name=Name;
        this.Age=Age;
        this.rollNumber=rollNumber;

    }
    void displayInfo(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Rollnumber:"+rollNumber);

    }
}