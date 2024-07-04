package com.java.conditionals;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
     int luckyNumber ;
     int Value=1;
     Scanner obj = new Scanner(System.in);
        System.out.println("Enter your lucky number:");
        luckyNumber = obj.nextInt();
        for (int i=2;i<luckyNumber;i++){
            if(luckyNumber%i==0){
                Value+=i;
            }
            else{
                continue;
            }
        }
        if (luckyNumber==Value){
            System.out.println("your lucky number is a perfect number");
        }
        else {
            System.out.println("your lucky number is not a perfect number");
        }
    }
}
