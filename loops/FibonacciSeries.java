package com.java.loops;

public class FibonacciSeries {
    static void Fibonacci() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Fibonacci Series:\n");
        while(n1<1000){
            System.out.println(n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
    }

    public static void main(String[] args) {
        // invoke the method
       FibonacciSeries.Fibonacci();
    }
}

