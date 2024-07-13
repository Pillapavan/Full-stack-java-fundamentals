package com.java.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] Ids = {2,4,3,5,4,1};
         int Length=Ids.length;
         int[] Reversed=new int[Length];
         for (int i=0;i<Length;i++){
             Reversed[i]=Ids[Length-1-i];
        }

         //reversed array
        for(int j=0;j<Length;j++){
            System.out.print(Reversed[j]+" ");
        }
    }
}
