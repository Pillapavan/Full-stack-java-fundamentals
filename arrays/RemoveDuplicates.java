package com.java.arrays;
import java.util.Arrays;

public class RemoveDuplicates {
   static  int removeDuplicateElements(int[] Ids){
      int Length=Ids.length;
      int Flag=0;
      int[] originalIds=new int[Length];
      for(int i=0;i<Length-1;i++){
          if (Ids[i]!=Ids[i+1]){
              originalIds[Flag]=Ids[i];
              Flag++;
          }
      }
      originalIds[Flag++]=Ids[Length-1];
      for (int j=0;j<Flag;j++){
          Ids[j]=originalIds[j];
      }
      return Flag;
  }

    public static void main(String[] args) {
       int[] Ids={2,3,4,4,5,3,2,1};
        Arrays.sort(Ids);
      int Length =  RemoveDuplicates.removeDuplicateElements(Ids);
      for (int k=0;k<Length;k++){
          System.out.print(Ids[k]+" ");
      }
    }
}
