package com.java.java8features;

import java.util.function.Predicate;

class FunctionalInterface{

    public static void main(String[] args) {
        //Predicate Functional Interface
        Predicate<Integer> isEvenPredicate = (num) -> num%2==0 ;
        System.out.println(isEvenPredicate.test(90));

    }

}
