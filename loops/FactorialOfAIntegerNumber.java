package com.java.loops;

public class FactorialOfAIntegerNumber {

         void Factorial(int Number){
                 int numFactorial=1;
                for(int i=1;i<=Number;i++){
                        numFactorial*=i;
                }
             System.out.println("Factorial of "+Number+" is :"+numFactorial);

        }

        public static void main(String[] args) {
                FactorialOfAIntegerNumber Obj=new FactorialOfAIntegerNumber();
                Obj.Factorial(5);

        }
}
