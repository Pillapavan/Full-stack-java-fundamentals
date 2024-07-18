package com.java.oopsfeatures.Abstraction;

public class AnimalTest {
    public static void main(String[] args) {
    Dog dog=new Dog("Dog",5);
    Bird bird=new Bird("Parrot",3);

       dog.move();
       dog.makeSound();

       bird.makeSound();
       bird.move();
    }

}
