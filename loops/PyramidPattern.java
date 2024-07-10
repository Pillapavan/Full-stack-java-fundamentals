package com.java.loops;

public class PyramidPattern {
    static void Pyramid(int Rows,int AsciiValue){
        for(int i=1;i<=Rows;i++){
            for(int j=0;j<Rows-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print((char)AsciiValue+" ");
                AsciiValue++;
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Pyramid(3,65);
    }
}
 /* output
      A
    B C D
  E F G H I
  */