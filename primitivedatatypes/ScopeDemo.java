package com.java.primitivedatatypes;

public class ScopeDemo {
    // class variable
    static String classVariable = "This is class variable";

    // instance variable
    String instanceVariable;

    public void demo() {
        // local variable
        String localVariable = "This is local variable";
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.instanceVariable = "This is instance variable";
        System.out.println(ScopeDemo.classVariable);
        System.out.println(obj.instanceVariable);
        obj.demo();
    }
}

