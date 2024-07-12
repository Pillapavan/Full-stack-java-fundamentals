package com.java.methods;

public class BankAccount {
    String  accountNumber;
    String accountHolderName;
    double Balance;
    double deposit(double Amount){
        Balance+=Amount;
        return Balance;
    }
    double withdraw(double Amount){
        Balance-=Amount;
        return Balance;
    }
    void displayInfo(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account holder Name:"+accountHolderName);
        System.out.println("current Balance:"+Balance);
    }
}
