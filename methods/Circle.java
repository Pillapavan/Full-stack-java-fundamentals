package com.java.methods;

public class Circle {
    //radius (double), color (String)
    double Radius;
    String Color;
    double getArea(){
        double Area = 3.14*Radius*Radius;
        return Area;
    }
    double getCircumference(){
        double Circumference=2*3.14*Radius;
        return Circumference;
    }
    void displayInfo(){
        System.out.println("Radius of a circle:"+Radius);
        System.out.println("color of a circle:"+Color);
        System.out.println("Area of a circle:"+getArea());
        System.out.println("Circumference of a circle:"+getCircumference());
    }
}
