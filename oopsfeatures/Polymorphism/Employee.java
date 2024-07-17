package com.java.oopsfeatures.Polymorphism;

public class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    double calculateBonus(){
        return 0.0;
    }
    void displayInfo(){
        System.out.println("Employee Name:"+name);
        System.out.println("Employee salary:"+salary);
        System.out.println("Bonus:"+calculateBonus());
    }
}
