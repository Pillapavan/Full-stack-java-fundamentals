package com.java.loops;

public class ZeroOneTrianglePattern {
    static void ZeroOnePattern(int Rows){
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ZeroOneTrianglePattern.ZeroOnePattern(4);
    }
}



/* output

  1
  0 1
  1 0 1
  0 1 0 1

 */