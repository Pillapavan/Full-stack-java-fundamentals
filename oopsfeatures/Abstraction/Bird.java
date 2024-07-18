package com.java.oopsfeatures.Abstraction;

public class Bird extends Animal{
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Animal name:"+name);
        System.out.println("caw.....");
    }

    @Override
     void move() {
        System.out.println("Animal age:"+age);
        System.out.println("Walking....");

    }
}
