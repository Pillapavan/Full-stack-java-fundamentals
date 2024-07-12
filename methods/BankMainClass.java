package com.java.methods;

public class BankMainClass {
    public static void main(String[] args) {
        BankAccount Customer;
        Customer=new BankAccount();
        Customer.accountNumber="23234855436";
        Customer.accountHolderName="praveen";
        Customer.Balance=3000.45;

        //methods calling
        //deposit
        Customer.deposit(30000);
        Customer.displayInfo();

        //withdraw
        Customer.withdraw(2000);
        Customer.displayInfo();
    }
}
