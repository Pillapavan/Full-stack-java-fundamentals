package com.java.oopsfeatures.Polymorphism;

public class Developer extends Employee{
    double fixedBonus;


    Developer(String name, double salary,double fixedBonus) {
        super(name, salary);
        this.fixedBonus=fixedBonus;
    }

    double calculateBonus(){
        return fixedBonus;
    }
    void displayInfo(){
        super.displayInfo();
    }
}
