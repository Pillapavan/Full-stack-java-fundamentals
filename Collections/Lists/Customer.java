package com.java.Collections.Lists;

import java.util.Objects;

public class Customer{

    String Name;
    int age;

    public Customer(String name,int age) {
        this.Name = name;
        this.age =age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
