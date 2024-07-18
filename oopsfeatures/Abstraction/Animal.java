package com.java.oopsfeatures.Abstraction;

public abstract class Animal {
    abstract void makeSound();
    abstract void move();
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
}
