package com.java.oopsfeatures.Encapsulation;

public class Student {
    private  String Name;
    private int Age;
    private double Grade;

    Student(){

    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public  int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public double getGrade(){
        return Grade;
    }
    public void setGrade(double Grade){
        this.Grade=Grade;
    }

    public void displayInfo(){
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Grade:"+getGrade());
    }



}
