package com.java.methods;

public class CarMainClass {
    public static void main(String[] args) {
        Car myCar;
        myCar= new Car();
        myCar.Brand="Tata";
        myCar.Model="frontier";
        myCar.Year=2020;
        myCar.Price=2000000;
        myCar.Color="Blue";
        //method calling
        myCar.displayInfo();

        System.out.println();


    }


}
