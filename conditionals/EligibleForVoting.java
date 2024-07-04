package com.java.conditionals;
import  java.util.Scanner;
public class EligibleForVoting {
    public static void main(String[] args) {
        int  voterAge ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the voter age");
        voterAge = obj.nextInt();
        if (voterAge>=18){
            System.out.println("Voter is Eligible for voting");
        }
        else{
            System.out.println("Voter is not eligible for voting");
        }
    
    }
}

