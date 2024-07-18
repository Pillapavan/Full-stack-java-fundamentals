package com.java.Exceptions;

import java.util.Scanner;

public class ArithmaticException {

    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no1:");
        n1=scanner.nextInt();
        System.out.println("Enter the no2:");
        n2=scanner.nextInt();

        try{
            int Res=n1/n2;
            System.out.println("Result :"+Res);
        }catch (ArithmeticException e){
            System.out.println(e);
            /*e.printStackTrace();
            System.out.println(e.getMessage());*/
            input();
        }

    }
    static void input(){
        System.out.println("Method is called...");
    }
}
