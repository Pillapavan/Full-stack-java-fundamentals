package com.java.oopsfeatures.Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Manager manger=new Manager("pavan",44000,5);
        Developer developer= new Developer("tataji",44000,10000);
        manger.calculateBonus();
        manger.displayInfo();

        System.out.println();
        developer.calculateBonus();
        developer.displayInfo();
    }
}
