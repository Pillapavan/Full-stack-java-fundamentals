package com.java.arrays;

public class MatrixMultiplication {
    static void matrixMul(int[][] Matrix1,int[][] Matrix2){
        int Row1=Matrix1.length;
        int Col1=Matrix1[0].length;
        int Row2=Matrix2.length;
        int Col2=Matrix2[0].length;
        int[][] Result=new int[Row1][Col2];
        for (int i=0;i<Row1;i++){
            for (int j=0;j<Col2;j++){
                Result[i][j]=0;
                for (int k=0;k<Col1;k++){
                    Result[i][j]+=Matrix1[i][k]*Matrix2[k][j];
                }

            }
        }
        for (int l=0;l<Result.length;l++){
            for (int m=0;m<Result[0].length;m++){
                System.out.print(Result[l][m]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] Matrix1={{1,2,3},
                         {2,3,4}};
        int[][] Matrix2={{2,3,4},
                         {9,8,7},
                         {10,3,7}};
        if (Matrix1[0].length == Matrix2.length){
            MatrixMultiplication.matrixMul(Matrix1,Matrix2);
        }
        else{
            System.out.println("Matrix Multiplication is Not Possible");
        }
    }
}
