package com.java.arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
          //jagged Arrays
        int[][] twoD= {{1,3,4,5},{23,5,6}};

        //Acessing Array
        for(int[] oneD:twoD){
            for(int Value:oneD){
                System.out.print(Value+" ");
            }
            System.out.println();

        }
    }
}
