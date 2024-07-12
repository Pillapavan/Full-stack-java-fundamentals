package com.java.loops;

public class FloydTriangle {
    //Write the code to print the floyd’s triangle?
    static void Floyd(int Rows){
        int Temp=1;
        for(int i=0;i<Rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(Temp+" ");
                Temp++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        FloydTriangle.Floyd(5);
    }
}

/* output
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15

 */