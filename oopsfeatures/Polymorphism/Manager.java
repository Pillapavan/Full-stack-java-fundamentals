package com.java.oopsfeatures.Polymorphism;

public class Manager extends Employee{
    double bonusPercentage;

    Manager(String name, double salary,double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage=bonusPercentage;
    }

    @Override
    double calculateBonus() {
        return salary*bonusPercentage;
    }
    void displayInfo(){
       super.displayInfo();
    }
}
